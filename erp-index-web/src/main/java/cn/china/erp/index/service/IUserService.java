package cn.china.erp.index.service;

import cn.china.erp.index.bean.User;

import java.util.List;

/**
 * Created by lixiang on 17/3/1.
 */
public interface IUserService {

    boolean insertUser(User user);   //添加
    boolean deleteById(int id);            //删除
    boolean updateUser(User user);    //修改
    User queryById(int id);              //根据ID查询
    List<User> queryAllUser();
}
