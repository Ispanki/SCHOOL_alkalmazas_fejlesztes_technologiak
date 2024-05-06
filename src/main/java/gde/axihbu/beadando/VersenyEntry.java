package gde.axihbu.beadando;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class VersenyEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long versenyId;
    private String nev;
    private Integer tavolsag;

    public Long getVersenyId(){
        return versenyId;
    }
    public void setVersenyID(Long id){
        this.versenyId = id;
    }

    public String getNev(){
        return nev;
    }
    public void setNev(String newNev){
        this.nev = newNev;
    }

    public Integer getTavolsag(){
        return tavolsag;
    }
    public void setTavolsag(Integer newTavolsag){
        this.tavolsag = newTavolsag;
    }
}
