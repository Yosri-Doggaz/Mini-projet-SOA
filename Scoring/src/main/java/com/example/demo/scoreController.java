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
    public ScoringResult calculScore(@RequestBody requestType r) {
    	return new ScoringResult(scoreService.calculate(r));
    }
}

 class ScoringResult {
    private String scoringResult;

     public ScoringResult(String scoringResult) {
         this.scoringResult = scoringResult;
     }

     public String getScoringResult() {
         return scoringResult;
     }

     public void setScoringResult(String scoringResult) {
         this.scoringResult = scoringResult;
     }
 }
