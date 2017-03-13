package cn.china.erp.index.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by lixiang on 17/2/22.
 * <p>
 * 这个类主要就是用来注入datasource，不然每声明一个DAO都需要注入datasource
 */
public class JdbcBaseDao extends JdbcDaoSupport{

    @Resource
    protected DataSource dataSource;

    @PostConstruct
    protected void inject() {
        this.setDataSource(dataSource);
    }
}
