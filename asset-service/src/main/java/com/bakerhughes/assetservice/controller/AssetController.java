package com.bakerhughes.assetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")
public class AssetController {

    @GetMapping
    public String getAssets() {
        return "This will return all assets";
    }
}
