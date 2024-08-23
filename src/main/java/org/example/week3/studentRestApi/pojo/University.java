package org.example.week3.studentRestApi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class University {

    private String country;
    private List<String> domains;

    @JsonProperty("state-province")
    private String stateProvince; // JSON key is "state-province", so we'll map it using @JsonProperty

    @JsonProperty("web_pages")
    private List<String> webPages;

    private String name;

    @JsonProperty("alpha_two_code")
    private String alphaTwoCode; // JSON key is "alpha_two_code", so we'll map it using @JsonProperty

    // Getters and Setters

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }
}
