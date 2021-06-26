package com.azure.spring.springazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureSpringController {

    @GetMapping("/message")
    public String getMessage(){
        return "You are now in delpoyed te Spring boot app in Azure cloud App service. This is the second commit on the repo on master brnach so check the CICI pipeline";
    }
}
