package com.bakerhughes.analyticsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analytics")
public class AnalyticsController {

    @GetMapping
    public String getAnalytics() {
        return "This will return analytics data";
    }
}