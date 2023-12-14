package lk.ijse.dep11.URL_Shortner.modal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

// Represents a URL entity with fields for the database ID, short URL, and original URL
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shortUrl;
    private  String originalUrl;

}