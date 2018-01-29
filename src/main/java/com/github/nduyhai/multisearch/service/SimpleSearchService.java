package com.github.nduyhai.multisearch.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SimpleSearchService implements SearchService {
    @Override
    public Optional<String> search(String criteria) {
        return Optional.empty();
    }
}
