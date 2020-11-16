package com.example.newsapi.newsapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsAPIController {

    NewsAPIService newsAPIService;

    @Autowired
    public void setNewsAPIService(NewsAPIService newsAPIService) { this.newsAPIService = newsAPIService; }

    @GetMapping("/news/{countryCode}/{category}")
    public NewsAPI callAPI(@PathVariable String countryCode, @PathVariable String category) {
        return newsAPIService.callAPI(countryCode, category); }

}
