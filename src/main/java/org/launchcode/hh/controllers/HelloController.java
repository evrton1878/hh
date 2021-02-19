package org.launchcode.hh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

//@RequestMapping("hello")
public class HelloController {

//@GetMapping("hello")
//@ResponseBody
//handles request to /hello
   // public String hello(){
      //  return "Hello Spring";
    //}
    //now lives in /hello/goodbye
    @GetMapping("goodbye")
    @ResponseBody
//handles request to /hello
    public String goodbye(){
        return "goodbye Spring";
    }

    //handeles request of the form /hello?name=everton
    //now lives /hello/hello
   @RequestMapping(method={RequestMethod.GET,RequestMethod.POST}, value ="hello")
   @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "hello " + name + "!";
}
// hadles request of the form /hello/launchcode
    @GetMapping("hello/{name}")
    @ResponseBody
public String helloWithPathParam(@PathVariable String name){
        return "hello " + name +"!";
    }
    @GetMapping("form")
    public String helloForm(){

        return "form";
    }
}


