package com.docker.DockerTrial;

import java.util.Date;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
public class DockerTrialApplication extends SpringBootServletInitializer{
    
    public static void main(String[] args) {
        SpringApplication.run(DockerTrialApplication.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DockerTrialApplication.class);
    }
}

//@RestController
//class HelloDockerRestController {
//
//    @RequestMapping("/hello/{name}")
//    public String helloDocker(@PathVariable(value = "name") String name) {
//        String response = "Hello " + name + " Response received on : " + new Date();
//        System.out.println(response);
//        return response;
//    }
//}
