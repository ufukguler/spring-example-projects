package com.redis.data.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "longRunningMethod")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000);
        return "Worked!";
    }

    @CacheEvict(cacheNames = "longRunningMethod")
    public void clearCache() {
        System.out.println("cache was cleaned!");
    }

}
