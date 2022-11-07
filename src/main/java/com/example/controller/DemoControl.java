package com.example.controller;

import com.example.service.DemoServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoControl {

    @Autowired
    DemoServ ds;

    @GetMapping(value = "/nomi", produces = "application/json")
    public ResponseEntity<?> getNomi(){
        List<String> nomi=ds.getNomi();
        return new ResponseEntity<>(nomi.get(1), HttpStatus.OK);
    }

    @GetMapping(value = "/nomi2", produces = "application/json")
    public ResponseEntity<?> getNomi2(){
        //List<String> nomi=ds.getNomi();
        return new ResponseEntity<>("ciao",HttpStatus.OK);
    }
}
