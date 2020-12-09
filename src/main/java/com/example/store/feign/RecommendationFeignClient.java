package com.example.store.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "recommendation")
public interface RecommendationFeignClient {

    @GetMapping("/")
    ResponseEntity<String> getRecommendations();
}
