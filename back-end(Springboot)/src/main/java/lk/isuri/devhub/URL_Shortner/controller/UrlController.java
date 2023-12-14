package lk.isuri.devhub.URL_Shortner.controller;

import lk.isuri.devhub.URL_Shortner.modal.Url;
import lk.isuri.devhub.URL_Shortner.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("url/shortener")
@CrossOrigin(origins = "http://localhost:4200")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginalUrl (@PathVariable String id){
        return urlService.getOriginalUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url){
        return urlService.generateShortUrl(url);
    }





}
