package cn.itcast.user.web.controller;


import cn.itcast.user.domain.Account;
import cn.itcast.user.domain.TransferInfo;
import cn.itcast.user.domain.User;
import cn.itcast.user.service.AccountService;
import cn.itcast.user.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("/findByCondition")
    @ResponseBody
    public List<User> findByCondition(User condition){
        List<User> userList = userService.findByCondition(condition);
        for (User user : userList) {
            System.out.println(user);
        }
        return userService.findByCondition(condition);
    }

}
