package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
public class clientController {


    @Autowired
    private clientService clientService;

    @Autowired
    private  clientRepo clientrepo;

    @RequestMapping(value="/createClient", method=RequestMethod.POST)
    public Client createClient(@RequestBody Client c) {
    	return clientService.create(c);
    }

    @RequestMapping(value="/getClientByCin", method=RequestMethod.GET)
    public Client getClientByCin(@RequestParam String cin) {
    	return clientService.getClientByCin(cin);
    }
    @RequestMapping(value="/checkExist", method=RequestMethod.GET)
    public CheckResponse checkExist(@RequestParam String c) {
    	return new CheckResponse(clientService.checkExist(c));
    }
    @RequestMapping(value="/random-client", method=RequestMethod.GET)
    public Client randoClientData() {
        List<Client> cs =(List<Client>)clientrepo.findAll() ;
        Client c = cs.get(0);
        c.setCin(c.getCin()+new Random().nextInt(99));
        return c;
    }
}
