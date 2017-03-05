package cn.china.erp.index.controller;

import cn.china.erp.index.bean.User;
import cn.china.erp.index.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/3/3.
 */

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @ResponseBody
    @RequestMapping(value = "/queryById", method = RequestMethod.GET)
    public User getUserById(long id){
        return userService.getUserById(id);
    }
}
