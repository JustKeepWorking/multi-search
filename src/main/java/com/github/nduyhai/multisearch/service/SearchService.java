package com.github.nduyhai.multisearch.service;

import java.util.Optional;

public interface SearchService {
    Optional<String> search(String criteria);
}
