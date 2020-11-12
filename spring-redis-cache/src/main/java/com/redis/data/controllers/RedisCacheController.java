package com.redis.data.controllers;

import com.redis.data.service.RedisCacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class RedisCacheController {
    private final RedisCacheService redisCacheService;

    public RedisCacheController(RedisCacheService redisCacheService) {
        this.redisCacheService = redisCacheService;
    }

    private int counter = 0;

    @GetMapping
    public String cacheControl() throws InterruptedException {
        // clean cache every 5 request
        if (counter == 5) {
            redisCacheService.clearCache();
            counter = 0;
        }
        counter++;
        return redisCacheService.longRunningMethod();
    }
}
