package com.beloni.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class StartApp {

    @RequestMapping(value="/")
    public String start(Map<String, Object> model){
        System.out.println("Current dir:");
        System.out.println(System.getProperty("user.dir"));
        return "capa";

    }
}
