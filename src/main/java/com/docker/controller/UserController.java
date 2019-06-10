/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.controller;

import com.docker.service.UserService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.docker.model.User;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mahima
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    
    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public ModelAndView helloDocker() {
        System.out.println("inside controller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    
//     @RequestMapping(value = {"/hello/{fname}/{lname}"}, method = RequestMethod.GET)
//    public ModelAndView helloDocker(@PathVariable String fname, @PathVariable String lname) {
//        ModelAndView modelAndView = new ModelAndView();
//        User user = new User();
//        user.setFname(fname);
//        user.setLname(lname);
//        User savedUser = userService.addUser(user);
//        System.out.println("save user --> "+savedUser);
//        String response = "Hello " + fname + " " + lname + " Response received on : " + new Date();
//        System.out.println(response);
//        modelAndView.addObject("Message", response);
//        modelAndView.setViewName("index");
//        return modelAndView;
//    }
}
