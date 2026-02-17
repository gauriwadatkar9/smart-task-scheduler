package com.gauri.smartscheduler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Smart Task Scheduler Backend is Running 🚀";
    }
}
