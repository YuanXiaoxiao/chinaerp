package cn.china.erp.index.service;

import cn.china.erp.index.bean.User;
import cn.china.erp.index.dao.UserDAO;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lixiang on 17/3/1.
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserDAO userDAO;

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
    public User getUserById(long id) {
        return userDAO.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return null;
    }
}
