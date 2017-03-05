package cn.china.erp.index.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by lixiang on 17/3/5.
 */
@Repository
public class IbatisBaseDAO extends SqlMapClientDaoSupport {

    @Resource
    private SqlMapClient sqlMapClient;


    @PostConstruct
    protected void inject() {
        this.setSqlMapClient(sqlMapClient);
    }
}
