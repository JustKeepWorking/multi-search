package com.github.nduyhai.multisearch.controller;

import com.github.nduyhai.multisearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/search")
public class SearchController {

    private SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/movie")
    public String search(@RequestParam String criteria) {
        final Optional<String> result = this.searchService.search(criteria);
        return result.orElse("");
    }
}
