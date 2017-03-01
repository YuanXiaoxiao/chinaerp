package cn.china.erp.index.dao;

import cn.china.erp.index.bean.Account;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/21.
 */
public class UserDAOTest extends TestCase{

    @Resource
    private AccountDAO userDAO;

    @Resource
    private Account account;

    @Before
    void setup(){
        account.setUsername("lixiang");
    }

    @Test
    public void testGetAccount(){
//        Assert.assertEquals(userDAO.getAccount().getPassword(), "passwordofli");
    }
}
