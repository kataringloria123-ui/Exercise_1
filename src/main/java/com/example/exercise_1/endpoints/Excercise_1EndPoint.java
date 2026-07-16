package com.example.exercise_1.endpoints;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Excercise_1EndPoint {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/echo",method = RequestMethod.POST)
    public String echo(@RequestBody String body){
        return "echo: " +body;
    }
}
