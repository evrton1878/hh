package org.launchcode.hh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    public String helloWithQueryParam(@RequestParam String name, Model model){
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting",greeting); //"greeting" matches greeting from hello.html and greeting matches the variable in line30
        return "hello";
}
// hadles request of the form /hello/launchcode
    @GetMapping("hello/{name}")

public String helloWithPathParam(@PathVariable String name, Model model){
        String greeting = "Hello " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello ";
    }
    @GetMapping("form")
    public String helloForm(){

        return "form";
    }
    @GetMapping("hello-names")
    public String helloNames(Model model){
        List<String> names = new ArrayList<>();
        names.add("LaunchCode");
        names.add("Java");
        names.add("Javascript");
        model.addAttribute("names",names);
        return "hello-list";
    }
}


