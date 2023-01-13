package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class clientController {


    @Autowired
    private clientService clientService;

    @RequestMapping(value="/createClient", method=RequestMethod.POST)
    public Client createClient(@RequestBody Client c) {
    	return clientService.create(c);
    }

    @RequestMapping(value="/getClientByCin", method=RequestMethod.GET)
    public Client getClientByCin(@RequestParam String cin) {
    	return clientService.getClientByCin(cin);
    }
    @RequestMapping(value="/checkExist", method=RequestMethod.GET)
    public Boolean checkExist(@RequestParam String c) {
    	return clientService.checkExist(c);
    }
}
