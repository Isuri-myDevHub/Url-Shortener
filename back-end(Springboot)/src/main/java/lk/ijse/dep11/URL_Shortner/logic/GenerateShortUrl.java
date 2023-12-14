// Package declaration for the URL shortener logic
package lk.ijse.dep11.URL_Shortner.logic;

// Import necessary classes
import com.google.common.hash.Hashing;
import org.apache.commons.validator.routines.UrlValidator;

import java.nio.charset.Charset;

// Class to generate short URLs based on Murmur3 hashing
public class GenerateShortUrl {

    // Method to generate a short URL from the given long URL
    public static String getShortUrl(String url) {
        // Use Murmur3_32_fixed hashing algorithm to generate a hash from the URL
        String shortUrl = Hashing.murmur3_32_fixed().hashString(url, Charset.defaultCharset()).toString();

        // Return the generated short URL
        return shortUrl;
    }

    //Validates a URL using Apache Commons Validator library.
    public static boolean isUrlValid(String url) {

        // Create an instance of UrlValidator with allowed schemes "http" and "https"
        UrlValidator urlValidator = new UrlValidator(
                new String[]{"http","https"}
        );
        // Check if the provided URL is valid based on the configured schemes
        boolean result = urlValidator.isValid(url);

        // Return the validation result
        return result;
    }

}

