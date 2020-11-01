package demo.api;
/*
  User: Ufuk
  Date: 15.09.2020 13:46
*/

import demo.entity.Kullanici;
import demo.repository.KullaniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanici")
public class KullaniciApi {

    private KullaniciRepository kullaniciRepository;
/*
    @PostConstruct
    void init(){
        Kullanici k = new Kullanici();
        k.setAdi("Haydi");
        k.setSoyadi("Kodlayalim");
        kullaniciRepository.save(k);
    }
*/
    @Autowired
    public KullaniciApi(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    @PostMapping
    public ResponseEntity<Kullanici> ekle(@RequestBody Kullanici kullanici) {
        return ResponseEntity.ok(kullaniciRepository.save(kullanici));
    }

    @GetMapping
    public ResponseEntity<List<Kullanici>> tumunuListele() {
        return ResponseEntity.ok(kullaniciRepository.findAll());
    }
}
