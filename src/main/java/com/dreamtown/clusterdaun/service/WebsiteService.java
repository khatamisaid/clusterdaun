package com.dreamtown.clusterdaun.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dreamtown.clusterdaun.entity.Website;
import com.dreamtown.clusterdaun.repository.WebsiteRepository;

@Service
public class WebsiteService {

    @Autowired
    private WebsiteRepository websiteRepository;

    public String websiteName() {
        Website web = websiteRepository.findAll().get(0);
        String[] splitNamaWeb = web.getWebsiteName().split(" ");
        if (splitNamaWeb.length > 1) {
            String temp = "";
            for (int i = 1; i < splitNamaWeb.length; i++) {
                temp += " " + splitNamaWeb[i];
            }
            String span = "<span style=\"color: white;\">" + temp + "</span>";
            return "<h2 style='cursor:pointer' onclick=\"window.location.href='/'\" class='text-left'>" + splitNamaWeb[0] + " " + temp + "</h2>";
        }
        return "<h2>" + web.getWebsiteName() + "<h2>";
    }

    public Website website() {
        return websiteRepository.findAll().get(0);
    }

    public String websiteNameAdmin() {
        Website web = websiteRepository.findAll().get(0);
        String[] splitNamaWeb = web.getWebsiteName().split(" ");
        if (splitNamaWeb.length > 1) {
            String temp = "";
            for (int i = 1; i < splitNamaWeb.length; i++) {
                temp += " " + splitNamaWeb[i];
            }
            String span = "<span>" + temp + "</span>";
            return "<h2>" + splitNamaWeb[0] + span + "<h2>";
        }
        return "<h2>" + web.getWebsiteName() + "<h2>";
    }
}
