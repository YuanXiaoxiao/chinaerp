package cn.china.erp.index.dao;

import cn.china.erp.index.bean.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lixiang on 17/2/20.
 */

@Repository
public class UserDAO extends JdbcBaseDao{

    private JdbcTemplate jdbcTemplate;

//    private DataSource dataSource;
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }


    public Account getAccount() {

        return getJdbcTemplate().queryForObject("select username, password from account where id = 1", new RowMapper<Account>(){
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException{
                Account account1 = new Account();
                account1.setUsername(rs.getString("username"));
                account1.setPassword(rs.getString("password"));
                return account1;
            }
        });
    }

    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
//        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
//        Account account = new Account();
//        account.setUsername("lixiang");
//        System.out.print(userDAO.getAccount(account).getPassword());

        //这样用 ， userdao jdbctemplate 和 datasource 是注入不进来的
//        UserDAO userDAO = new UserDAO();
//        Account account = new Account();
//        account.setUsername("lixiang");
//        System.out.print(userDAO.getAccount(account).getPassword());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-beans.xml");
        JdbcBaseDao jdbcBaseDao = (JdbcBaseDao) applicationContext.getBean("userDAO");
//        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        UserDAO userDAO = new UserDAO();
        System.out.print(userDAO.getAccount().getPassword());
    }
}
