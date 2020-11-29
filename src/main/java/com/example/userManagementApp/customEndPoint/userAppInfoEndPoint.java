package com.example.userManagementApp.customEndPoint;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Endpoint(id = "userAppInfo")
public class userAppInfoEndPoint {

    @ReadOperation
    public UserAppInfo userAppInfo() {

        Map<String, Object> details = new LinkedHashMap<>();

        details.put("App Location", "Reporting from -->Mars");
        details.put("Status", "Reporting From Mars !!All good ;)");

        UserAppInfo health = new UserAppInfo();
        health.setHealthdetails(details);
        return health;
    }

    @ReadOperation
    public String userAppEndpointByName(@Selector String Name){
        return "This is UserManagementApp Application , reporting from mars . All ok here "+Name;
    }


    @WriteOperation
    public  void WriteOperation(@Selector String Name){


    }
    @DeleteOperation
    public void DeleteOperation(@Selector String Name){

    }

}
