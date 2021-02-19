package org.launchcode.hh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //tells to submit request /hello path
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}


