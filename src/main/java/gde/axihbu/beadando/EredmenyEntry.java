package gde.axihbu.beadando;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EredmenyEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eredmenyId;
    private VersenyEntry verseny;
    private VersenyzoEntry versenyzo;
    private Integer ido;

    public Long getErednemyId(){
        return eredmenyId;
    }
    public void setEredmenyID(Long id){
        this.eredmenyId = id;
    }

    public VersenyEntry getVerseny(){
        return verseny;
    }
    public void setVerseny(VersenyEntry verseny){
        this.verseny = verseny;
    }

    public VersenyzoEntry getVersenyzo(){
        return versenyzo;
    }
    public void setVersenyzo(VersenyzoEntry versenyzo){
        this.versenyzo = versenyzo;
    }

    public Integer getIdo(){
        return ido;
    }
    public void setIdo(Integer ido){
        this.ido = ido;
    }


}
