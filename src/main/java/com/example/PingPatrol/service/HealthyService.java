package com.example.PingPatrol.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class HealthyService {
    public boolean isHealthy(String url) {

        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();   // open a connection to the url
            connection.setRequestMethod("HEAD");                                                // HEAD request is used to check if the server is up and running
            int responseCode = connection.getResponseCode();                                    // get the response code, which will be used to determine if the server is up and running,
            if(responseCode >= 200 && responseCode < 300) {                                     // if the response code is between 200 and 400, the server is up and running
                return true;
            }
            return false;
        } catch (IOException e) {
            return false;
        }
    }
}
