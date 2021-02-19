package org.launchcode.hh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

@GetMapping("hello")
@ResponseBody
//handles request to /hello
    public String hello(){
        return "Hello Spring";
    }
}
