package com.datajpa.restapi.repository;

import com.datajpa.restapi.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepo extends JpaRepository<Adres, Long> {
}
