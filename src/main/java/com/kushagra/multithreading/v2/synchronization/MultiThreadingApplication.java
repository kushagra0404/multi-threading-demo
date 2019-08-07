package com.kushagra.multithreading.v2.synchronization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kushagra kumar
 * Module 2:
 * This module is to demonstrate how synchronization happens in java among the threads
 * The Example is taken as a Id Generator Service whose goal is to generates unique Id's
 */
@SpringBootApplication
public class MultiThreadingApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiThreadingApplication.class, args);
    }
}
