package com.example.hello.web;

import com.example.hello.bean.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/getData") // request localhost:8080/data/getData
    public Data getDemo(){
        Data data = new Data(1, "Someone");
        return data;
    }

}
