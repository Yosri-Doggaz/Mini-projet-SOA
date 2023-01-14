package tn.isi.RequestManagment.ControllerRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.RequestManagment.ReposityInterface.RequestRepository;
import tn.isi.RequestManagment.models.Request;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/request")
public class RequestController {

@Autowired
    RequestRepository requestRepository;


        @GetMapping(value ="/{request_id}" )
        public Request getRequestById(@PathVariable(value="request_id") Long request_id)
        {
            return requestRepository.findById(request_id).get();
        }
        @GetMapping(value ="/randomRequest" )
        public Request randomRequest()
        {
            Request r = new Request();
            Random ran = new Random();
            r.setDuree(ran.nextInt(99));
            r.setMontant(ran.nextDouble(1000,9999));
            return r;
        }
        @PostMapping(value="/")
       public Request createRequest(@RequestBody Request request )
        {
            return requestRepository.save(request);
        }






}
