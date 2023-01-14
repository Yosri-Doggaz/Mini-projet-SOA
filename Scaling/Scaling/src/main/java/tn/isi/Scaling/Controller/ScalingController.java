package tn.isi.Scaling.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.Scaling.Repository.ScalingRepository;
import tn.isi.Scaling.models.Scale;

import java.util.List;

@RestController
@RequestMapping("/scaling")
public class ScalingController {


    @Autowired
    ScalingRepository scalingRepository;


    @GetMapping(value ="" )
    public Scale getRequestById(@RequestParam("montant") double montant , @RequestParam("duree") int duree)
    {
        List<Scale> scales = scalingRepository.findAll();
        List<Scale> scales1 = scalingRepository.findAll();
        for(Scale s:scales1){
            if((montant>s.getMontantMax() || montant <s.getMontantMin()) || (duree>s.getDureeMax() || duree<s.getDureeMin()) ){
                scales.remove(s);
            }
        }
        if(scales.size()!=0) {
            Scale sc = scales.get(0);
            for (Scale s : scales) {
                if (sc.getTaux() < s.getTaux()) {
                    sc = s;
                }
            }
            return sc;
        }
        return new Scale();
    }
}
