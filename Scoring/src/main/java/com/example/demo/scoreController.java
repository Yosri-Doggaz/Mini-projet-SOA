package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class scoreController {


    @Autowired
    private scoreService scoreService;

    @RequestMapping(value="/calculScore", method=RequestMethod.POST)
    public String createFolder(@RequestBody requestType r) {
    	return scoreService.calculate(r);
    }
}
