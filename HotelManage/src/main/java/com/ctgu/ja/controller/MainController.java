package com.ctgu.ja.controller;

import com.ctgu.ja.service.CustomerService;
import com.ctgu.ja.service.ManagerService;
import com.ctgu.ja.service.impl.CustomerServiceImpl;
import com.ctgu.ja.service.impl.ManagerServiceImpl;
import com.ctgu.ja.vo.Customer;
import com.ctgu.ja.vo.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/customer")
public class MainController {
    @Resource
    public CustomerService customerservice;
    public ManagerService managerService;

    public MainController(){
        managerService = new ManagerServiceImpl();
        customerservice = new CustomerServiceImpl();
    }

    @RequestMapping("/addCustomer.do")
    public String addCustomer(Customer customer, ModelMap map){
        int nums = customerservice.addCustomer(customer);
        String tips = "注册失败";
        if(nums > 0){
            //注册成功
            tips = "客户" + customer.getCustomerName() + "注册成功";
        }
        map.addAttribute("tips",tips);
        return "result";
    }

    @RequestMapping(value = "/signIn.do")
    public String toSignIn(){
        return "signIn";
    }

    @RequestMapping(value = "/toWelcome.do")
    public String toWelcome(Manager manager, ModelMap map){
        Manager man = managerService.findManagerById(manager.getManagerId());
        String tips = "管理员" + manager.getManagerName() + "，欢迎你";
        if(man == null){
            tips = "管理员不存在，请重新登录";
            map.addAttribute("tips",tips);
            return "signIn";
        }
        map.addAttribute("tips",tips);
        return "welcome";
    }
}
