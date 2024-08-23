package org.example.week3.studentRestApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.example.week3.studentRestApi.pojo.University;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/external-api")
public class ExternalApiController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<List<University>> callExternalApi(@RequestParam(value = "country", required = false) String country) {
        // Build the URL dynamically
        String apiUrl;
        if (country != null) {
            // If a country is provided, fetch universities for that country
            apiUrl = "http://universities.hipolabs.com/search?country=" + country;
        } else {
            // If no country is provided, fetch universities from all countries
            apiUrl = "http://universities.hipolabs.com/search";
        }

        // Send the GET request and receive the response
        University[] universities = restTemplate.getForObject(apiUrl, University[].class);

        // Convert the array to a list
        List<University> universityList = Arrays.asList(universities);

        // Return the list as a JSON response
        return ResponseEntity.ok(universityList);

    }
}
