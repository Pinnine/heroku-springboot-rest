package com.example.gridSearch.controllers;

import com.example.gridSearch.utils.Solver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class RESTController {

    @PostMapping("/test")
    public String testPost() {
        return "POST: test ok 2";
    }
    @GetMapping("/test")
    public String testGet() {
        return "GET: test ok ";
    }
}
