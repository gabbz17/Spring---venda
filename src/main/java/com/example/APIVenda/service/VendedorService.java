package com.example.APIVenda.service;

import com.example.APIVenda.entity.Vendedor;
import com.example.APIVenda.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {

    @Autowired
    VendedorRepository repo;

    public Vendedor create(Vendedor user){
        return repo.save(user);
    }

    public List<Vendedor> findAll(){
        return repo.findAll();
    }
}
