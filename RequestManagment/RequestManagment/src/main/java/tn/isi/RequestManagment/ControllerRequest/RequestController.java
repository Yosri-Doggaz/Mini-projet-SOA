package tn.isi.RequestManagment.ControllerRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.RequestManagment.ReposityInterface.RequestRepository;
import tn.isi.RequestManagment.models.Request;

import java.util.List;

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

        @PostMapping(value="/")
       public Request createRequest(@RequestBody Request request )
        {
            return requestRepository.save(request);
        }






}
