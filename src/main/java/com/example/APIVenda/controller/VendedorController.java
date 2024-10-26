package com.example.APIVenda.controller;

import com.example.APIVenda.dto.VendedorDTO;
import com.example.APIVenda.dto.mapper.VendedorMapper;
import com.example.APIVenda.entity.Vendedor;
import com.example.APIVenda.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/vendedor")
public class VendedorController {

    @Autowired
    VendedorService service;

    @PostMapping
    public ResponseEntity<Vendedor> create(@RequestBody Vendedor user){
        Vendedor vend = service.create(user);
        return ResponseEntity.status(201).body(vend);
    }

    @GetMapping
    public ResponseEntity<List<VendedorDTO>> findAll(){
        List<Vendedor> list = service.findAll();
        List<VendedorDTO> dto = VendedorMapper.listToDTO(list);
        return ResponseEntity.ok().body(dto);
    }
}
