package com.qf.y1902.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    @RequestMapping(value = "/houtai")
    public String main(){
        return "houtai";
    }

    @RequestMapping("/{page}")
    public String huiyuan(@PathVariable("page") String page){
        return page;
    }
}
