package cn.china.erp.index.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by lixiang on 17/2/22.
 * <p>
 * 这个类主要就是用来注入datasource，不然每声明一个DAO都需要注入datasource
 */
public class JdbcBaseDao {

    @Resource
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    //注入dataSource， 将dataSource传递给jdbctemplate的构造方法里，构造出jdbctemplate的对象
    public JdbcTemplate getJdbcTemplate() {
        jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
}
