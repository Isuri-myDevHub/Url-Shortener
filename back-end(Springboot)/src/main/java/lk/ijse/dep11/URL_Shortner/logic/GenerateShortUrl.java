// Package declaration for the URL shortener logic
package lk.ijse.dep11.URL_Shortner.logic;

// Import necessary classes
import com.google.common.hash.Hashing;

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
}

