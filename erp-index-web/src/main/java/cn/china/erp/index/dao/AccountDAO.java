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
public class AccountDAO extends JdbcBaseDao{

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
}
