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
    public creditFolder createFolder(@RequestBody CreditFolderRequest c) {
    	creditFolder cf = new creditFolder();
        cf.setClientCin(c.getIdClient());
        cf.setDuree(c.getDuree());
        cf.setIdBarem(c.getIdBarem());
        cf.setMontant(c.getMontant());
        cf.setTaux(c.getTaux());
        double ineret = cf.getMontant()*cf.getTaux();
        cf.setInteret(ineret);
        double mensualite = (cf.getMontant()*cf.getInteret())/cf.getDuree();
        cf.setMensualite(mensualite);
        return folderService.create(cf);
    }
}
