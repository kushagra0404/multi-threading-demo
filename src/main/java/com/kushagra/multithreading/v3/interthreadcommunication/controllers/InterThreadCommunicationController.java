package com.kushagra.multithreading.v3.interthreadcommunication.controllers;

import com.kushagra.multithreading.v3.interthreadcommunication.services.InterThreadCommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterThreadCommunicationController {
    @Autowired
    InterThreadCommunicationService interThreadCommunicationService;

    @GetMapping("inter-thread-communication-demo")
    public ResponseEntity interThreadCommunication() {
        interThreadCommunicationService.interThreadCommunication();
        return ResponseEntity.status(HttpStatus.OK).body("Please check console!");
    }
}
