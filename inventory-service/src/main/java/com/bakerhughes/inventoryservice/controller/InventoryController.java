package com.bakerhughes.inventoryservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @GetMapping
    public String getInventoryInfo() {
        return "This will return inventory information";
    }

    @GetMapping("/{itemId}")
    public String getItemDetails(@PathVariable String itemId) {
        // Logic to retrieve item details
        return "Details for item: " + itemId;
    }

    @PostMapping
    public String addInventoryItem(@RequestBody String itemDetails) {
        // Logic to add a new inventory item
        return "New item added: " + itemDetails;
    }

    @PutMapping("/{itemId}")
    public String updateInventoryItem(@PathVariable String itemId, @RequestBody String itemDetails) {
        // Logic to update an existing inventory item
        return "Updated item " + itemId + " with details: " + itemDetails;
    }

    @DeleteMapping("/{itemId}")
    public String removeInventoryItem(@PathVariable String itemId) {
        // Logic to remove an inventory item
        return "Removed item: " + itemId;
    }
}