package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    DemoService demoService;

    @GetMapping("/names/{name}")
    public String getName(@PathVariable String name){

        return demoService.getNames(name);
    }
}
