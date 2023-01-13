package tn.isi.Scaling.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.isi.Scaling.Repository.ScalingRepository;
import tn.isi.Scaling.models.Scale;

@RestController
@RequestMapping("/scaling")
public class ScalingController {


    @Autowired
    ScalingRepository scalingRepository;


    @GetMapping(value ="/{id}" )
    public double getRequestById(@PathVariable(value="id") Long id)
    {
        return scalingRepository.findById(id).get().getTaux();
    }
}
