package tn.isi.BCT.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.BCT.Repository.BctRepository;

@RestController
@RequestMapping("/bct")
public class BctController {

    @Autowired
    BctRepository bctRepository;


    @GetMapping()
    public bctResult checkClientByCin(@RequestParam String cin)
    {
       if (bctRepository.getClientByCin(cin)!=null){
            return new bctResult(true);
    }
    return new bctResult(false);


    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class bctResult{
    private boolean bctexist;
}
