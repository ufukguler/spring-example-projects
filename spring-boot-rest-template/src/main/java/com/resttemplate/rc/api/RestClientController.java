package com.resttemplate.rc.api;

import com.resttemplate.rc.model.KisiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/test")
public class RestClientController {


    private final static String weburl = "http://localhost:8080/kisi";

    private final RestTemplate restTemplate;

    @Autowired
    public RestClientController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public ResponseEntity<List<KisiDto>> getKisiList() {
        ResponseEntity<List> result = restTemplate.getForEntity(weburl, List.class);
        List<KisiDto> responseBody = result.getBody();
        return ResponseEntity.ok(responseBody);
    }

    @PostMapping
    public ResponseEntity<KisiDto> kaydet(@RequestBody KisiDto kisiDto) {
        ResponseEntity<KisiDto> result = restTemplate.postForEntity(weburl, kisiDto, KisiDto.class);
        KisiDto response = result.getBody();
        return ResponseEntity.ok(response);
    }
}
