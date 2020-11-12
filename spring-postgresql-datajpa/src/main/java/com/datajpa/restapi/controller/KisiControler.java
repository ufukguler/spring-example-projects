package com.datajpa.restapi.controller;

import com.datajpa.restapi.dto.KisiDto;
import com.datajpa.restapi.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiControler {

    private final KisiService kisiService;

    @PostMapping
    public ResponseEntity<KisiDto> save(@RequestBody KisiDto kisiDto) {
        return ResponseEntity.ok(kisiService.save(kisiDto));
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> listele() {
        return ResponseEntity.ok(kisiService.getAll());
    }
}
