package com.demo.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    /*
    // http://localhost:8080/hello
    @GetMapping(value = "/hello")
    public String greeting(@PathVariable(){
        return "Hello!";
    }
     */


    // http://localhost:8080/hello/userName
    @GetMapping(value = "/hello/{name}")
    public String greeting(@PathVariable(value = "name") String name){
        return "Hello " + name;
    }

}
