package cn.china.erp.index.service;

import cn.china.erp.index.dao.AccountDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/20.
 */
@Service
public class AccountService implements IAccountservice {

    @Resource
    private AccountDAO accountDAO;

    @Override
    public boolean login() {
        return "lixiang".equals(accountDAO.getAccount().getUsername());
    }
}
