package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by levy on 2019/6/17.
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hi")
    @ResponseBody
    public String index() {
        return "hello world, bitch!!!!!hello world, bitch!!!!!";
    }


}