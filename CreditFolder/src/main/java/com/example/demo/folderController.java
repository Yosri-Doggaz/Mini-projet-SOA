package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class folderController {


    @Autowired
    private folderService folderService;

    @RequestMapping(value="/createFolder", method=RequestMethod.POST)
    public creditFolder createFolder(@RequestBody creditFolder c) {
    	return folderService.create(c);
    }
}
