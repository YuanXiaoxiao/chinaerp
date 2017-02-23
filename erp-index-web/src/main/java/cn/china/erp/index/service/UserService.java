package cn.china.erp.index.service;

import cn.china.erp.index.bean.Account;
import cn.china.erp.index.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/20.
 */
@Service
public class UserService implements IUserservice{

    @Resource
    private UserDAO userDAO;

    @Override
    public boolean login() {
        return "lixiang".equals(userDAO.getAccount().getUsername());
    }
}
