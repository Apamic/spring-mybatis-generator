package com.movev.springbootmybatisgenerator.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWrod {

//    @Autowired
//    DepartmentMapper departmentMapper;

    @ResponseBody
    @GetMapping("/query")
    public String returnHelloWrod() {
        return "HelloWrod";
    }

}
