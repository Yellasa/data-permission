package com.farpower.datapermission.controller;

import com.farpower.datapermission.service.UserService;
import com.farpower.himalayas.organ.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController
{
    @Autowired
    private UserService userService;


    //@DataAuthAnnotation(value="abc")
    @RequestMapping("/show")
    public User show() {
        User user = userService.getByAge(18);
        return user;
    }
}
