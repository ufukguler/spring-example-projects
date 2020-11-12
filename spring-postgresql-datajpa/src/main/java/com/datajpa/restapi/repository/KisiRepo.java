package com.datajpa.restapi.repository;

import com.datajpa.restapi.entity.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KisiRepo extends JpaRepository<Kisi, Long> {
}
