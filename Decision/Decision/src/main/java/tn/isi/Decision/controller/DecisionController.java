package tn.isi.Decision.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.isi.Decision.models.Decision;
import tn.isi.Decision.models.DecisionRequest;
import tn.isi.Decision.repository.DecisionRepo;

@RestController
@RequestMapping("/decision")
public class DecisionController {
    @Autowired
    private DecisionRepo decisionRepo;

    @PostMapping(value = "")
        public Decision saveDecision(@RequestBody DecisionRequest dec){
            Decision decision =  new Decision();
            decision.setRequest_id(dec.getRequest_id());
            if(dec.getScoringResult().equals("Rouge")){
                decision.setStatus("Refus");
            }else{
                decision.setStatus("Acceptation");
            }
            return decisionRepo.save(decision);
        }

}
