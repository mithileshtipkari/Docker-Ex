/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.service;

import com.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.docker.model.User;

/**
 *
 * @author mahima
 */
public class UserService{
    
    @Autowired
    UserRepository userRepo;
    
    public User addUser(User user){
        return userRepo.save(user);
    }
    
}
