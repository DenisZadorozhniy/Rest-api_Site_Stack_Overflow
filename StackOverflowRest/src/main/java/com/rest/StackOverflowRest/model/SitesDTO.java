package com.rest.StackOverflowRest.model;

import lombok.Data;

import java.util.List;

@Data
public class SitesDTO {
    private List<SiteObj> items;
}
