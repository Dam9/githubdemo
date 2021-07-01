package com.consumo.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthCheckController {

    @RequestMapping
    public ResponseEntity<String> healthCheck(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    /*
    @GetMapping(value="/healthcheck")
    public ResponseEntity<String> healthCheck(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PutMapping(value="/healthcheck")
    public void healthCheckPut(){
        return;
    }

    @PostMapping(value="/healthcheck")
    public void healthCheckPost(){
        return;
    }

    @DeleteMapping(value="/healthcheck")
    public void healthCheckDelete(){
        return;
    }

     */

}
