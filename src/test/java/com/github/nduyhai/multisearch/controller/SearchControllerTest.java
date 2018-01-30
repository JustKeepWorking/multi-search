package com.github.nduyhai.multisearch.controller;

import com.github.nduyhai.multisearch.service.SearchService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@WebMvcTest(SearchController.class)
public class SearchControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SearchService searchService;

    @Test
    public void searchDefaultTest() throws Exception {
        String criteria = "Fake";
        given(this.searchService.search(criteria)).willReturn(Optional.empty());

        this.mvc.perform(
                MockMvcRequestBuilders.get("/search/movie")
                        .param("criteria", criteria)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(""));

    }
}
