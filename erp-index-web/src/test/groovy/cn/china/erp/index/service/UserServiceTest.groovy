//package cn.china.erp.index.service
//
//import cn.china.erp.index.bean.Account
//import cn.china.erp.index.dao.UserDAO
//import org.junit.Test
//import org.springframework.beans.factory.annotation.Autowired
//
//
///**
// * Created by lixiang on 17/2/21.
// */
//class UserServiceTest extends GroovyTestCase {
//
//    @Autowired
//    def account = new Account()
//
//    @Autowired
//    def userDAO = new UserDAO()
//
//    void setUp() {
//        super.setUp()
////        userDAO = new UserDAO()
////        account = new Account()
//        account.setUsername("lixiang")
//    }
//
//    void tearDown() {
//
//    }
//
//    @Test
//    void testLogin() {
//        assertEquals(userDAO.getAccount(account).getPassword(), "passwordofli")
//    }
//}
