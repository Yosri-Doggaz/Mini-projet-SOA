package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class folderService {

    @Autowired
    private folderRepo folders;

    public creditFolder create(creditFolder f) {
        creditFolder fd = folders.save(f);
        return fd;
    }

}
