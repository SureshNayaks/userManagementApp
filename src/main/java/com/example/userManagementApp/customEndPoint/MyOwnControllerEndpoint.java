package com.example.userManagementApp.customEndPoint;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "endpointController")
public class MyOwnControllerEndpoint {

    @GetMapping("/mapping-end-point")
    public ResponseEntity readEndPoint(){
        return new ResponseEntity("This is egle reporting from jupiter", HttpStatus.OK);
    }
}
