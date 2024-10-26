package com.example.APIVenda.controller;

import com.example.APIVenda.dto.ClienteDTO;
import com.example.APIVenda.dto.mapper.ClienteMapper;
import com.example.APIVenda.entity.Cliente;
import com.example.APIVenda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody Cliente cl){
        Cliente cliente = service.create(cl);
        return ResponseEntity.status(201).body(cliente);
    }

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll(){
        List<Cliente> list = service.findAll();
        List<ClienteDTO> list1 = ClienteMapper.toAllDTO(list);
        return ResponseEntity.ok().body(list1);
    }
}
