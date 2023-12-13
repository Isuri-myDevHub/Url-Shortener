package lk.ijse.dep11.URL_Shortner.repository;

import lk.ijse.dep11.URL_Shortner.modal.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


 // Repository interface for managing Url entities.

public interface UrlRepository extends JpaRepository<Url, Integer> {


     // Custom query to retrieve the original URL based on the provided short URL identifier.

    @Query(value = "SELECT original_url FROM url WHERE short_url=?1", nativeQuery = true)
    String findByShortUrl(String id);
}
