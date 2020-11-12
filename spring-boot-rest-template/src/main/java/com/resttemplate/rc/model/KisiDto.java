package com.resttemplate.rc.model;

import java.util.List;

public class KisiDto {
    private Long id;
    private String adi;
    private String soyadi;
    private List<String> adres;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public List<String> getAdres() {
        return adres;
    }

    public void setAdres(List<String> adres) {
        this.adres = adres;
    }
}
