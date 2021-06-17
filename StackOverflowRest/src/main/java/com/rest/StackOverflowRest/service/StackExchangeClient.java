package com.rest.StackOverflowRest.service;


import com.rest.StackOverflowRest.model.SiteObj;
import com.rest.StackOverflowRest.model.SitesDTO;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class StackExchangeClient {

    HttpClient httpClient = HttpClientBuilder.create().build();
    ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public List<SiteObj> getSites() {

        String webSiteUrl = "https://api.stackexchange.com/2.2/sites?page=1&pagesize=999&filter=!FmdZfVGXZN9h5PtNfuvm(ASXcf";

        SitesDTO response = null;
        try {
            response = restTemplate.getForObject(new URI(webSiteUrl), SitesDTO.class);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return response.getItems();
    }
}
