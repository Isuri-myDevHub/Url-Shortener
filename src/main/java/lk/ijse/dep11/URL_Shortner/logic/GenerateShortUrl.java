package lk.ijse.dep11.URL_Shortner.logic;


import com.google.common.hash.Hashing;

import java.nio.charset.Charset;

public class GenerateShortUrl {

    public static  String getShortUrl(String url){
        String shortUrl= Hashing.murmur3_32_fixed().hashString(url, Charset.defaultCharset()).toString();
        return shortUrl;
    }


}
