package cn.china.erp.index.util;

/**
 * Created by lixiang on 17/3/11.
 *
 * Twitter的 Snowflake　JAVA实现方案
 *
 */
public class IdWorker {

    private final long workerId;
    private final static long twepoch = 1488338496008L; // 时间起始标记点（2017/3/11:21:36:8的UNIX 毫秒级别时间戳），一般不能变动
    private long sequence = 0L; //并发控制位
    private final static long workerIdBits = 5L; //机器标识位
    public final static long maxWorkerId = -1L ^ -1L << workerIdBits;  //最大支持 0 ~ 31 共32台机器

    private final static long sequenceBits = 9L;

    private final static long workerIdShift = sequenceBits;
    private final static long timestampLeftShift = sequenceBits + workerIdBits;
    public final static long sequenceMask = -1L ^ -1L << sequenceBits;

    private long lastTimestamp = -1L;

    public IdWorker(final long workerId) {
        super();
        if (workerId > IdWorker.maxWorkerId || workerId < 0) {
            throw new IllegalArgumentException(String.format(
                    "worker Id can't be greater than %d or less than 0",
                    IdWorker.maxWorkerId));
        }
        this.workerId = workerId;
    }

    public synchronized long nextId() {
        //获取当前时间
        long timestamp = this.timeGen();

        if (this.lastTimestamp == timestamp) {
            this.sequence = (this.sequence + 1) & IdWorker.sequenceMask;
            if (this.sequence == 0) {
                timestamp = this.tilNextMillis(this.lastTimestamp);
            }
        } else {
            this.sequence = 0;
        }
        if (timestamp < this.lastTimestamp) {
            try {
                throw new Exception(
                        String.format(
                                "Clock moved backwards.  Refusing to generate id for %d milliseconds",
                                this.lastTimestamp - timestamp));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.lastTimestamp = timestamp;
        long nextId = ((timestamp - twepoch << timestampLeftShift))
                | (this.workerId << IdWorker.workerIdShift) | (this.sequence);
        return nextId;
    }

    private long tilNextMillis(final long lastTimestamp) {
        long timestamp = this.timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = this.timeGen();
        }
        return timestamp;
    }

    private long timeGen() {
        return System.currentTimeMillis() ;
    }
}

