package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class clientController {


    @Autowired
    private clientService clientService;

    @RequestMapping(value="/createClient", method=RequestMethod.POST)
    public Client createClient(@RequestBody Client c) {
    	return clientService.create(c);
    }

    @RequestMapping(value="/getClientByCin", method=RequestMethod.POST)
    public Client getClientByCin(@RequestBody String cin) {
    	return clientService.getClientByCin(cin);
    }
    @RequestMapping(value="/checkExist", method=RequestMethod.POST)
    public Boolean checkExist(@RequestBody String c) {
    	return clientService.checkExist(c);
    }
}
