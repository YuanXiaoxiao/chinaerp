package cn.china.erp.index.service;

import cn.china.erp.index.bean.Account;
import org.springframework.stereotype.Service;

/**
 * Created by lixiang on 17/2/20.
 */
@Service
public class UserService implements IUserservice{

    @Override
    public boolean login(Account account) {
        return false;
    }
}
