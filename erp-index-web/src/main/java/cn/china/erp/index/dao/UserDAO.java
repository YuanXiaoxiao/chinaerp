package cn.china.erp.index.dao;

import cn.china.erp.index.bean.User;
import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by lixiang on 17/3/1.
 */
@Repository
public class UserDAO extends SqlMapClientDaoSupport {

    public User queryById(long id) {
        return (User) getSqlMapClientTemplate().queryForObject("userById", id);
    }
}
