package com.anubhavadhyayan.journalApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck(){
        return "API is working fine.";
    }

    @GetMapping("/anu")
    public String printOwnerName() {
        return "Anubhav Adhyayan";
    }

    private final Map<String, Object> apiHealthCheck = new HashMap<>();
    @GetMapping("/api_check")
    public Map<String, Object> apiCheck(){
        apiHealthCheck.put("status", true);
        apiHealthCheck.put("message", "Api is working fine.");
        return apiHealthCheck;
    }
}
