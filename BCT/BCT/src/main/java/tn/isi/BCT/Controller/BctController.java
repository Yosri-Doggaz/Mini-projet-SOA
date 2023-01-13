package tn.isi.BCT.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.BCT.Repository.BctRepository;

@RestController
@RequestMapping("/bct")
public class BctController {

    @Autowired
    BctRepository bctRepository;


    @GetMapping()
    public boolean checkClientByCin(@RequestParam String cin)
    {
       if (bctRepository.getClientByCin(cin)!=null){
            return true;
    }
    return false;


    }
}


