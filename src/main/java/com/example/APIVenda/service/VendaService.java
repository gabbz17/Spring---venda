package com.example.APIVenda.service;

import com.example.APIVenda.entity.Produto;
import com.example.APIVenda.entity.Venda;
import com.example.APIVenda.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {

    @Autowired
    VendaRepository repo;

    @Autowired
    ProdutoService service;

    public Venda create(Venda venda){
        Produto pd = service.findByNome(venda.getNomeProduto());
        if (pd.getQtnd() != 0){
            pd.setQtnd(pd.getQtnd() - 1);
            venda.setValorVenda(pd.getPreco());
        } else {
            throw new RuntimeException("Produto indisponível");
        }
        return repo.save(venda);
    }

    public List<Venda> findAll(){
        return repo.findAll();
    }

}
