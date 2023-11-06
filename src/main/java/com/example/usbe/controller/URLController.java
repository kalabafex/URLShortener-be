package com.example.usbe.controller;

import com.example.usbe.entity.URL;
import com.example.usbe.repo.URLRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URI;
import java.util.Optional;

@RestController
public class URLController {
    @Autowired
    private URLRepo urlRepo;

    @PostMapping("")
    public URL shortenUrl(@RequestBody URL url){
        return urlRepo.save(url);
    }
    @GetMapping("/{key}")
    public ResponseEntity<Void> getOriginalUrl(@PathVariable String key){
        Optional<URL> url = urlRepo.findById(key);
        String u = "";
        if(url.isPresent()){
            u=url.get().getValue();
        }
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(u)).build();
    }
}
