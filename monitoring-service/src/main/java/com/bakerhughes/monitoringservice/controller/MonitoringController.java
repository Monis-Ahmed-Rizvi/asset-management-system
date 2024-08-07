package com.bakerhughes.monitoringservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/monitoring")
public class MonitoringController {

    @GetMapping
    public String getMonitoringInfo() {
        return "This will return monitoring information";
    }

    @GetMapping("/asset/{assetId}")
    public String getAssetStatus(@PathVariable String assetId) {
        // Logic to retrieve asset status
        return "Status for asset: " + assetId;
    }

    @PostMapping("/alert")
    public String createAlert(@RequestBody String alertDetails) {
        // Logic to create a new alert
        return "New alert created: " + alertDetails;
    }

    @GetMapping("/alerts")
    public String getAlerts() {
        // Logic to retrieve all active alerts
        return "List of active alerts";
    }

    @PutMapping("/alert/{alertId}")
    public String updateAlert(@PathVariable String alertId, @RequestBody String alertDetails) {
        // Logic to update an existing alert
        return "Updated alert " + alertId + " with details: " + alertDetails;
    }
}