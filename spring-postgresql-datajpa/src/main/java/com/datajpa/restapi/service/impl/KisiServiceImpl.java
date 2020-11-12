package com.datajpa.restapi.service.impl;

import com.datajpa.restapi.dto.KisiDto;
import com.datajpa.restapi.entity.Adres;
import com.datajpa.restapi.entity.Kisi;
import com.datajpa.restapi.repository.AdresRepo;
import com.datajpa.restapi.repository.KisiRepo;
import com.datajpa.restapi.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KisiServiceImpl implements KisiService {

    private final KisiRepo kisiRepo;
    private final AdresRepo adresRepo;

    @Override
    @Transactional
    public KisiDto save(KisiDto kisiDto) {

        Kisi kisi = new Kisi();
        kisi.setAdi(kisiDto.getAdi());
        kisi.setSoyadi(kisiDto.getSoyadi());
        final Kisi kisiDb = kisiRepo.save(kisi);
        List<Adres> liste = new ArrayList<>();

        kisiDto.getAdres().forEach(item -> {
            Adres adres = new Adres();
            adres.setAdres(item);
            adres.setAdresTip(Adres.adresTip.DIGER);
            adres.setAktif(true);
            adres.setKisi(kisiDb);
            liste.add(adres);
        });
        adresRepo.saveAll(liste);
        kisiDto.setId(kisiDb.getId());
        return kisiDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<KisiDto> getAll() {
        List<Kisi> kisiler = kisiRepo.findAll();
        List<KisiDto> kisiDtos = new ArrayList<>();

        kisiler.forEach(item -> {
            KisiDto kisiDto = new KisiDto();
            kisiDto.setId(item.getId());
            kisiDto.setAdi(item.getAdi());
            kisiDto.setSoyadi(item.getSoyadi());
            kisiDto.setAdres(item.getAdresList()
                    .stream()
                    .map(Adres::getAdres)
                    .collect(Collectors.toList())
            );
            kisiDtos.add(kisiDto);
        });
        return kisiDtos;
    }


    @Override
    public Page<KisiDto> getAll(Pageable pageable) {
        return null;
    }
}
