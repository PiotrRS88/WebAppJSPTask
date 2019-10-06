package com.taskwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class TaskWebappJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskWebappJspApplication.class, args);
    }

}
