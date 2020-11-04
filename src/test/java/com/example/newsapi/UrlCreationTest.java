package com.example.newsapi;

import com.example.newsapi.newsapi.NewsAPIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UrlCreationTest {

    NewsAPIService newsAPIService;

    @Autowired
    public void setNewsAPIService(NewsAPIService newsAPIService) { this.newsAPIService = newsAPIService; }

    @Test
    public void checkURLTest() {
        String expectedURL= "https://newsapi.org/v2/top-headlines?country=pl&category=business&apiKey=ee409c1f26a54613ac37ac156c1df2c1";
        assertEquals(expectedURL, newsAPIService.buildURL("pl", "business"), "Must return " + expectedURL);
    }


}
