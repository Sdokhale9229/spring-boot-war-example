package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        return " The deploy stage is where you can orchestrate software releases to production or other environments. Your pipeline can be configured to deploy code on a schedule, roll out software to all customers or just a select group, and even roll back releases when there is a problem. You get to decide what the best strategy is for getting updated software to your customers. It can all be automated as part of your CI/CD pipeline. The DNA of continuous integration is configuration. CI pipelines are the highest level of orchestration in a config file	        CI is a software development strategy that increases development speed while ensuring the quality of code deployed is not compromised. Using CI tools, developers continually commit code in small increments, sometimes multiple times a day, which is then automatically built and tested before it is merged with the shared repository. Modern software delivery pipelines can build, test, and deploy applications based on your business needs.  ";
    }

}
