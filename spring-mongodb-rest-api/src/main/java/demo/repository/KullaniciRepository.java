package demo.repository;
/*
  User: Ufuk
  Date: 15.09.2020 13:39
*/

import demo.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface KullaniciRepository extends MongoRepository<Kullanici, String> {
}
