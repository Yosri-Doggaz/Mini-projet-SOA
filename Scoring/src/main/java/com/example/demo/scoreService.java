package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class scoreService {

    @Autowired
    private scoreRepo scores;

    public String calculate(requestType r) {
    	Score s = new Score();
    	s.setIdFolder(r.getIdFolder());
    	s.calculateScore(r);
        scores.save(s);
        return s.getEvaluation();
    }

}
