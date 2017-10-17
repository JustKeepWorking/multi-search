package com.nduyhai.multisearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @GetMapping("/movie/{type}")
    public String search(@PathVariable("type") String type ) {
        return "";
    }
}
