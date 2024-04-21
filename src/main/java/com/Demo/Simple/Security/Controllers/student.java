package com.Demo.Simple.Security.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/student")
public class student {


    @GetMapping("/students")
    public String listOfStudent()
    {
        return "Student Available currently in System";
    }
}
