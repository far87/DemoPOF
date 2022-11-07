package com.example.service;

import com.example.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServ {

    @Autowired
    DemoRepo dr;

    public List<String> getNomi(){
       return dr.getNomi();
    }



}
