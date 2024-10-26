package com.example.APIVenda.controller;

import com.example.APIVenda.entity.Produto;
import com.example.APIVenda.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto pd){
        Produto produto = service.create(pd);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        List<Produto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Produto> findByNome(@PathVariable String nome){
        Produto pd = service.findByNome(nome);
        return ResponseEntity.ok().body(pd);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto pd){
        Produto produto = service.update(id, pd);
        return ResponseEntity.ok().body(produto);
    }
}
