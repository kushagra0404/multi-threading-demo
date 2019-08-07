package com.kushagra.multithreading.v2.synchronization.controllers;

import com.kushagra.multithreading.v2.synchronization.services.SynchronizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SynchronizationController {
    @Autowired
    SynchronizationService synchronizationService;

    @GetMapping("unsynchronized-id-generator-demo")
    public ResponseEntity generateId() {
        synchronizationService.generateId();
        return ResponseEntity.status(HttpStatus.OK).body("Please check the console!");
    }

    @GetMapping("synchronized-id-generator-demo")
    public ResponseEntity generateIdSynchronized() {
        synchronizationService.generateIdSynchronized();
        return ResponseEntity.status(HttpStatus.OK).body("Please check the console!");
    }
}
