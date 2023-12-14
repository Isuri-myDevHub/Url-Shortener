package lk.isuri.devhub.URL_Shortner.service;

import lk.isuri.devhub.URL_Shortner.modal.Url;
import lk.isuri.devhub.URL_Shortner.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static lk.isuri.devhub.URL_Shortner.logic.GenerateShortUrl.getShortUrl;
import static lk.isuri.devhub.URL_Shortner.logic.GenerateShortUrl.isUrlValid;

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

       // Validates a URL and prints a message if it is not valid.
            if(! isUrlValid(url)) {
                System.out.println("URL is not valid");
                return null;
            }

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
