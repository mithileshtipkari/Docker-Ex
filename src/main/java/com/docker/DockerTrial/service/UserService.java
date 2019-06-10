/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.DockerTrial.service;

import com.docker.DockerTrial.model.User;
import com.docker.DockerTrial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahima
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepo;

    public User addUser(User user) {
        return userRepo.save(user);
    }

}
