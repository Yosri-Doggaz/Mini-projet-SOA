package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class clientService {

    @Autowired
    private clientRepo Clients;

    public Client create(Client c) {
        Client cl = Clients.save(c);
        return cl;
    }
    
   public Client getClientByCin(String Cin) {
    	return Clients.findById(Cin).orElse(new Client());
    }
    
    public Boolean checkExist(String cin) {
    	return Clients.existsById(cin);
    }

}
