package com.sun.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @RequestMapping("/index")
    public String index(){
        int m=1/0;
        return "aaa";
    }

    @RequestMapping("/getMap")
    public Map<String,Object>  getMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("aaaa","aaaa");
        map.put("bbbb","bbbb");
        return map;
    }


}
