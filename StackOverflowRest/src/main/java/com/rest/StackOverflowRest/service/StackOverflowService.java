package com.rest.StackOverflowRest.service;

import com.rest.StackOverflowRest.model.SiteObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackOverflowService {

    @Autowired
    private StackExchangeClient stackExchangeClient;

    public List<SiteObj> findAll(){
        return  stackExchangeClient.getSites();
    }

}
