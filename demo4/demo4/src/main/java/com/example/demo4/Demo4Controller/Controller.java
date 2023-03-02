package com.example.demo4.Demo4Controller;

import com.example.demo4.Demo4Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {

    @Autowired
    DemoService demoService;

    @PostMapping("/name")
    public String getNames(@RequestParam String name)
    {
        return demoService.getName(name);
    }
    @

}
