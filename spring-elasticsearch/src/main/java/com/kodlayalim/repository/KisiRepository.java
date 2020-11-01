package com.kodlayalim.repository;

import com.kodlayalim.entity.Kisi;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface KisiRepository extends ElasticsearchRepository<Kisi, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\": \"?0\"}}]}}")
    List<Kisi> getByCustomQuery(String search);

    List<Kisi>  findByAdLikeOrSoyadLike(String ad, String soyad);
}
