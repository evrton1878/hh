package org.launchcode.hh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//@GetMapping("hello")
//@ResponseBody
//handles request to /hello
   // public String hello(){
      //  return "Hello Spring";
    //}
    @GetMapping("goodbye")
    @ResponseBody
//handles request to /hello
    public String goodbye(){
        return "goodbye Spring";
    }

    //handeles request of the form /hello?name=everton
@GetMapping("hello")
    @ResponseBody
    public String HelloWithQueryParam(@RequestParam String name){
        return "hello " + name + "!";
}
}


