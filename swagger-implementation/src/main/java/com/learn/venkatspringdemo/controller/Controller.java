package com.learn.venkatspringdemo.controller;

import com.learn.venkatspringdemo.dto.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest")
@Api(value = "Sample Springboot Application", description = "Sample springboot app for training")
public class Controller {

    @ApiOperation(value = "Default text when Loading URI", response = String.class)
    @GetMapping
    public String getText(){
        return "Enter /student in the URL";
    }

    @ApiOperation(value = "Get student object", response = Student.class)
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Suresh","Hyderabad");
    }



}
