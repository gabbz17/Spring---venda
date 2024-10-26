package com.example.APIVenda.controller;

import com.example.APIVenda.entity.Venda;
import com.example.APIVenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/venda")
public class VendaController {

    @Autowired
    VendaService service;

    @PostMapping
    public ResponseEntity<Venda> create(@RequestBody Venda venda){
        Venda vd = service.create(venda);
        return ResponseEntity.status(201).body(vd);
    }

    @GetMapping
    public ResponseEntity<List<Venda>> findAll(){
        List<Venda> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
