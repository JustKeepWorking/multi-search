package com.github.nduyhai.multisearch.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchServiceTest {

    @Autowired
    private SearchService searchService;

    @Test
    public void criteriaDefault() {
        final Optional<String> search = this.searchService.search("");
        Assert.assertEquals(search, Optional.empty());
    }
}
