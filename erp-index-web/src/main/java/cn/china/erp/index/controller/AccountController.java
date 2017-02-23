package cn.china.erp.index.controller;

import cn.china.erp.index.bean.Account;
import cn.china.erp.index.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/20.
 */
@RequestMapping(value = "/account")
@Controller
//@Scope("prototype")  默认是单例模式， prototype每次请求都会新建一个实例
public class AccountController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(Account account){
        return userService.login();
    }
}
