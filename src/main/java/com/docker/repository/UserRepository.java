/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docker.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.docker.model.User;
/**
 *
 * @author mahima
 */
public interface UserRepository  extends MongoRepository<User, String>{
    
}
