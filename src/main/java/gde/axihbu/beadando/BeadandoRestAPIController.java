package gde.axihbu.beadando;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gde.axihbu.beadando.entry.VersenyzoEntry;
import gde.axihbu.beadando.repository.EredmenyRepository;
import gde.axihbu.beadando.repository.VersenyRepository;
import gde.axihbu.beadando.repository.VersenyzoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class BeadandoRestAPIController {
    @Autowired
    private VersenyRepository versenyRepository;

    @Autowired
    private VersenyzoRepository versenyzoRepository;

    @Autowired
    private EredmenyRepository eredmenyRepositor;

    @GetMapping("/getRunners")
    public List<VersenyzoEntry> getRunners() {
        return versenyzoRepository.findAll();
    }
    
    @PostMapping("/addRunner")
    public String addRunner() {
        return "";
    }
    
    @GetMapping("/getRaceRunner/{ID}")
    public String getRaceRunner() {
        return new String();
    }
    
    @PostMapping("/updateRace")
    public String updateRace() {
        return new String();
    }
    
    @PostMapping("/addResult")
    public String addResult() {
        return "";
    }
    
    @GetMapping("/getAverageTime/{VERSENYID}")
    public String getAverageTime() {
        return new String();
    }
}
