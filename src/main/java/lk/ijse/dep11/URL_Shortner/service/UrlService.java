package lk.ijse.dep11.URL_Shortner.service;

import lk.ijse.dep11.URL_Shortner.modal.Url;
import lk.ijse.dep11.URL_Shortner.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static lk.ijse.dep11.URL_Shortner.logic.GenerateShortUrl.getShortUrl;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    /*
     Retrieves the original URL associated with the provided short URL identifier.
     */
    public String getOriginalUrl(String id) {
        return urlRepository.findByShortUrl(id);
    }

    /*
     Generates a short URL for the provided original URL and saves it to the repository.
     */
    public Url generateShortUrl(String url) {

        // Create a new Url object
        Url urlObject = new Url();
        // Set the original URL in the Url object
        urlObject.setOriginalUrl(url);
        // Generate a short URL and set it in the Url object
        urlObject.setShortUrl(getShortUrl(url));

        // Save the Url object to the repository and return the saved object
        return urlRepository.save(urlObject);
    }
}
