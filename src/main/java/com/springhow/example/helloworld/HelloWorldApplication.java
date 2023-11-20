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
        return " The deploy stage is where you can orchestrate software releases to production or other environments. Your pipeline can be configured to deploy code on a schedule, roll out software to all customers or just a select group, and even roll back releases when there is a problem. You get to decide what the best strategy is for getting updated software to your customers. It can all be automated as part of your CI/CD pipeline. The DNA of continuous integration is configuration. CI pipelines are the highest level of orchestration in a config file	        CI is a software development strategy that increases development speed while ensuring the quality of code deployed is not compromised. Using CI tools, developers continually commit code in small increments, sometimes multiple times a day, which is then automatically built and tested before it is merged with the shared repository. Modern software delivery pipelines can build, test, and deploy applications based on your business needs. Under a DevOps model, development and operations teams are no longer “siloed.” Sometimes, these two teams are merged into a single team where the engineers work across the entire application lifecycle, from development and test to deployment to operations, and develop a range of skills not limited to a single function.Regulatory compliance (governance and risk) are also best addressed early and throughout the development lifecycle. Regulated industries are often mandated to provide a certain level of observability, traceability and access of how features are delivered and managed in their runtime operational environment. This requires planning, development, testing, and enforcement of policies in the continuous delivery pipeline and in the runtime environment. Auditability of compliance measures is extremely important for proving compliance to 3rd party auditors.At the organizational level, DevOps requires continuous communication, collaboration and shared responsibility among all software delivery stakeholders - software development and IT operations teams for certain, but also security, compliance, governance, risk and line-of-business teams - to innovate quickly and continually, and to build quality into software from the start.Another way to put this is that DevSecOps is what DevOps was supposed to be from the start. But two of the early significant (and for a time insurmountable) challenges of DevOps adoption were integrating security expertise into cross-functional teams (a cultural problem), and implementing security automation into the DevOps lifecycle (a technical issue). Security came to be perceived. ";
    }

}
