package cn.china.erp.index.service;

import cn.china.erp.index.bean.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

/**
 * Created by lixiang on 17/3/1.
 */
public class UserService extends SqlMapClientDaoSupport implements IUserService{

    @Override
    public boolean insertUser(User user) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public User queryById(int id) {
        return null;
    }

    @Override
    public List<User> queryAllUser() {
        return null;
    }
}
