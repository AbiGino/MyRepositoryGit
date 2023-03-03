package com.example.Demo5.Demo5Service;

import com.example.Demo5.Exception.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

@Autowired
ApiResponse apiResponse;
    public ApiResponse addName(String name) {

        if (name.isEmpty()) {
            apiResponse.setStatus(400);
            apiResponse.setData("Null");
            apiResponse.setMessage("data not found");
        } else {
            apiResponse.setStatus(200);
            apiResponse.setData(name);
            apiResponse.setMessage("data found");
        }
        return apiResponse;
    }
}
