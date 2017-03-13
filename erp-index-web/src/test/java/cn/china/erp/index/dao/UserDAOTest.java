package cn.china.erp.index.dao;

import cn.china.erp.index.bean.User;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/*.xml")
public class UserDAOTest extends TestCase{

    @Resource
    private UserDAO userDAO;

    private User user;

    @Before
    public void setup(){
        user = new User();
        user.setUsername("lixiang");
    }

    @Test
    public void testGetAccount(){
        Assert.assertEquals(userDAO.queryById(11111111).getUsername(), user.getUsername());
    }
}
