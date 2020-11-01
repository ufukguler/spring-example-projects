package com.kodlayalim.api;
/*
  User: Ufuk
  Date: 15.09.2020 18:31
*/

import com.kodlayalim.entity.Kisi;
import com.kodlayalim.repository.KisiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kisi")
public class KisiController {
    @Autowired
    private KisiRepository kisiRepository;

    @PostConstruct
    public void init(){
        Kisi kisi = new Kisi();
        kisi.setAd("ufuk");
        kisi.setSoyad("guler");
        kisi.setAdres("test");
        kisi.setDTarih(Calendar.getInstance().getTime());
        kisi.setId("K0001");
        kisiRepository.save(kisi);
    }
    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search){
        List<Kisi> kisiler = kisiRepository.findByAdLikeOrSoyadLike(search, search);
        return ResponseEntity.ok(kisiler);
    }
}
