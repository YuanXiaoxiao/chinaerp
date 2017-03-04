package cn.china.erp.index.dao;

import cn.china.erp.index.bean.User;
import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by lixiang on 17/3/1.
 */
@Repository
public class UserDAO extends SqlMapClientDaoSupport {

    @Resource
    protected SqlMapClient sqlMapClient;

    @PostConstruct
    protected void inject(){
        this.setSqlMapClient(sqlMapClient);
    }
    public User queryById(long id) {
        return (User) getSqlMapClientTemplate().queryForObject("userById", id);
    }
}
