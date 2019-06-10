/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.DockerTrial.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.docker.DockerTrial.model.User;
/**
 *
 * @author mahima
 */
public interface UserRepository  extends MongoRepository<User, String>{
    
}
