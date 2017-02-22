//package cn.china.erp.index.dao;
//
//import cn.china.erp.index.bean.Account;
//import junit.framework.Assert;
//import junit.framework.TestCase;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import javax.annotation.Resource;
//
///**
// * Created by lixiang on 17/2/21.
// */
//public class UserDAOTest extends TestCase{
//
//    private UserDAO userDAO;
//    private Account account;
//
//    @Before
//    void setup(){
//        userDAO = new UserDAO();
//        account = new Account();
//        account.setUsername("lixiang");
//    }
//
//    @Test
//    void testGetAccount(){
//        Assert.assertEquals(userDAO.getAccount(account).getPassword(), "passwordofli");
//    }
//}
