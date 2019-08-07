package com.kushagra.multithreading.v1.basics.controllers;

import com.kushagra.multithreading.v1.basics.services.MultiThreadingDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MultiThreadingDemoController {
    @Autowired
    MultiThreadingDemoService multiThreadingDemoService;

    @GetMapping("start-multi-thread-demo")
    public ResponseEntity startMultiThreadingDemo() {
        multiThreadingDemoService.startMultiThreadingDemo();
        return ResponseEntity.status(HttpStatus.OK).body("Please check console!");
    }
}
