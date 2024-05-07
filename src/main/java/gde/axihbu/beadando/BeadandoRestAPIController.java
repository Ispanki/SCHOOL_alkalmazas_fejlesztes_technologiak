package gde.axihbu.beadando;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import gde.axihbu.beadando.entry.EredmenyEntry;
import gde.axihbu.beadando.entry.VersenyEntry;
import gde.axihbu.beadando.entry.VersenyzoEntry;
import gde.axihbu.beadando.repository.EredmenyRepository;
import gde.axihbu.beadando.repository.VersenyRepository;
import gde.axihbu.beadando.repository.VersenyzoRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class BeadandoRestAPIController {
    @Autowired
    private VersenyRepository versenyRepository;

    @Autowired
    private VersenyzoRepository versenyzoRepository;

    @Autowired
    private EredmenyRepository eredmenyRepository;

    @GetMapping("/getRunners")
    public List<VersenyzoEntry> getRunners() {
        return versenyzoRepository.findAll();
    }
    
    @PostMapping("/addRunner")
    public VersenyzoEntry addRunner(@RequestBody VersenyzoEntry newRunner) {
        VersenyzoEntry v = versenyzoRepository.save(newRunner);
        return v;
    }
    
    @GetMapping("/getRaceRunner/{ID}")
    public List<Map<String, Object>> getRaceRunners(@PathVariable Long ID) {
        List<EredmenyEntry> eredmenyek = eredmenyRepository.findAllByVerseny_VersenyId(ID);
        List<Map<String, Object>> response = new ArrayList<>();

        for (EredmenyEntry eredmeny : eredmenyek) {
            Map<String, Object> runner = new HashMap<>();
            runner.put("nev", eredmeny.getVersenyzo().getNev());
            runner.put("ido", eredmeny.getIdo());
            response.add(runner);
        }

        return response;
    }
    
    @PostMapping("/updateRace")
    public VersenyEntry updateRace(@RequestBody VersenyEntry updatedRace) {
        VersenyEntry race = versenyRepository.findById(updatedRace.getVersenyId()).orElseThrow();
        race.setNev(updatedRace.getNev());
        race.setTavolsag(updatedRace.getTavolsag());
        VersenyEntry v = versenyRepository.save(race);
        return v;
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
