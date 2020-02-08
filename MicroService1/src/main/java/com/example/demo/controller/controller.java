package com.example.demo.controller;

import com.example.demo.domain.HelloBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/")
public class controller
{
    @GetMapping(value = "/hello")
    public String get()
    {
        return "HEllo WPRLD";
    }

    @GetMapping(value = "/hello-bean")
    public HelloBean getbean()
    {
        return new HelloBean("PARTH APTEL");
    }

    @GetMapping(value = "/hello/path/{name}")
    public HelloBean getpath(@PathVariable String name)
    {
        return new HelloBean(String.format("Hello :: %s", name));
    }
}
