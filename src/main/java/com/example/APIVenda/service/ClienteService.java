package com.example.APIVenda.service;

import com.example.APIVenda.entity.Cliente;
import com.example.APIVenda.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repo;

    public Cliente create(Cliente cl){
        return repo.save(cl);
    }

    public List<Cliente> findAll(){
        return repo.findAll();
    }
}
