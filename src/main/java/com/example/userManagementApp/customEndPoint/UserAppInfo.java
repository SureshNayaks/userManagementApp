package com.example.userManagementApp.customEndPoint;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserAppInfo {

    private Map<String,Object> healthdetails = new LinkedHashMap<>();

    public Map<String, Object> getHealthdetails() {
        return healthdetails;
    }

    public void setHealthdetails(Map<String, Object> healthdetails) {
        this.healthdetails = healthdetails;
    }
}
