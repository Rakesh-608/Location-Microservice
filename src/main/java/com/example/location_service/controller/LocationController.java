package com.example.location_service.controller;

import com.example.location_service.domain.LocationDetails;
import com.example.location_service.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public LocationDetails getLocation(@RequestParam double latitude, @RequestParam double longitude) {
        return locationService.getLocationDetails(latitude, longitude);
    }
}

