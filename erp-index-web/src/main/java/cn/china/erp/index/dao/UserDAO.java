package cn.china.erp.index.dao;

import cn.china.erp.index.bean.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import javax.activation.DataSource;
import javax.annotation.Resource;

/**
 * Created by lixiang on 17/3/1.
 */
@Repository
public class UserDAO extends SqlMapClientDaoSupport {

//    @Resource
//    private DataSource dataSource;

    public User getUserById(long id){
        return (User) getSqlMapClientTemplate().queryForObject("userById");
    }
}
