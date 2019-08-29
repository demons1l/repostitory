package cn.itcast.user.web.controller;

import cn.itcast.user.domain.Account;
import cn.itcast.user.domain.TransferInfo;
import cn.itcast.user.service.AccountService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Reference
    private AccountService accountService;

    @RequestMapping("/updateByCondition")
    @ResponseBody
    public void updateByCondition(Account account){
        accountService.updateByCondition(account);
    }


    @RequestMapping("/transfer")
    @ResponseBody
    public void transfer(TransferInfo transferInfo){
        accountService.transfer(transferInfo);
    }

}
