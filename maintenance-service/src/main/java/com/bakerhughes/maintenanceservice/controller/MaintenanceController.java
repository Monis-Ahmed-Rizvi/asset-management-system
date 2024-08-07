package com.bakerhughes.maintenanceservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @GetMapping
    public String getMaintenanceInfo() {
        return "This will return maintenance information";
    }

    @PostMapping("/schedule")
    public String scheduleMaintenance(@RequestBody String maintenanceDetails) {
        // Logic to schedule maintenance
        return "Maintenance scheduled: " + maintenanceDetails;
    }

    @GetMapping("/history/{assetId}")
    public String getMaintenanceHistory(@PathVariable String assetId) {
        // Logic to retrieve maintenance history
        return "Maintenance history for asset: " + assetId;
    }

    @PostMapping("/work-order")
    public String createWorkOrder(@RequestBody String workOrderDetails) {
        // Logic to create a work order
        return "Work order created: " + workOrderDetails;
    }
}