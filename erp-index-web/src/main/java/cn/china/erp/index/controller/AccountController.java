package cn.china.erp.index.controller;

import cn.china.erp.index.bean.Account;
import cn.china.erp.index.service.IAccountservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by lixiang on 17/2/20.
 */
@RequestMapping(value = "/account")
@Controller
//@Scope("prototype")  默认是单例模式， prototype每次请求都会新建一个实例
public class AccountController {

    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Resource
    private IAccountservice accountService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(Account account){
        return accountService.login();
    }

    @RequestMapping(value = "ceshi", method = RequestMethod.GET)
    public Object ceshi(){
        logger.info("这里输出的info级别的日志");
        return "ceshi";
    }

    //加responsebody注解，为了返回时让messageconverter进行处理
    @ResponseBody
    @RequestMapping(value = "ceshijson", method = RequestMethod.GET)
    public Object ceshiJson(){
        Account account = new Account();
        account.setUsername("lixiang");
        account.setPassword("lixiangofpassword");
        return account;
    }
}
