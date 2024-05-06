package gde.axihbu.beadando;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class VersenyzoEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long versenyzoId;
    private String nev;
    private Integer kor;
    private Boolean isFerfi;

    public Long getVersenyzoId(){
        return versenyzoId;
    }
    public void setVersenyzoId(Long id){
        this.versenyzoId = id;
    }

    public String getNev(){
        return nev;
    }
    public void setNev(String newNev){
        this.nev = newNev;
    }

    public Integer getKor(){
        return kor;
    }
    public void setKor(Integer newKor){
        this.kor = newKor;
    }

    public boolean getIsFerfi(){
        return isFerfi;
    }
    public void setIsFerfi(Boolean newIsFerfi){
        this.isFerfi = newIsFerfi;
    }

}
