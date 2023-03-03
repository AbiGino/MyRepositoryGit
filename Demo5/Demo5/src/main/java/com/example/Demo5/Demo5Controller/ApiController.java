package com.example.Demo5.Demo5Controller;

import com.example.Demo5.Demo5Service.ApiService;
import com.example.Demo5.Exception.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    public ApiResponse apiResponse;
    @Autowired
    public ApiService apiservice;

    @PostMapping("/addname")
    public ApiResponse addUserName(String name) {

        return apiservice.addName(name);

    }
}
