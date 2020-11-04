package com.example.newsapi.newsapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * call API here and retrieve key and URL from application.properties
 */
@Service
public class NewsAPIService {

    private final String APIKey;
    private final String url;
    private RestTemplate restTemplate;

    // calls the values from application.properties
    public NewsAPIService(@Value("${APIKey}") String APIKey, @Value("${URL}") String url, RestTemplate restTemplate) {
        this.APIKey = APIKey;
        this.url = url;
        this.restTemplate = restTemplate;
    }

    public NewsAPI callAPI(String countryCode, String category) {
        String url = buildURL(countryCode,category);
        System.out.println(url);
        NewsAPI newsAPI = restTemplate.getForObject( url, NewsAPI.class);
        return newsAPI;
    }

    public String buildURL(String countryCode, String category) {
        return this.url + "?country=" + countryCode + "&category=" + category + "&apiKey=" + APIKey;
    }

}
