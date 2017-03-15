package cn.china.erp.index.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by lixiang on 17/3/15.
 */
@Repository
public class IbatisOtherDAO extends SqlMapClientDaoSupport {

    @Resource
    private SqlMapClient sqlMapClient4Other;


    @PostConstruct
    protected void inject() {
        this.setSqlMapClient(sqlMapClient4Other);
    }
}
