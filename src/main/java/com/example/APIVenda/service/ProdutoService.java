package com.example.APIVenda.service;

import com.example.APIVenda.entity.Produto;
import com.example.APIVenda.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repo;

    public Produto create(Produto pd){
        return repo.save(pd);
    }

    public List<Produto> findAll(){
        return repo.findAll();
    }

    public Produto findById(Long id){
        return repo.findById(id).get();
    }

    public Produto findByNome(String nome){
        return repo.findByNomeContaining(nome);
    }

    public Produto update(Long id, Produto pd){
        Produto produto = findById(id);
        if (pd.getNome() == null){
            pd.setNome(produto.getNome());
        } else if (pd.getQtnd() == null) {
            pd.setQtnd(produto.getQtnd());
        } else if (pd.getPreco() == null) {
            pd.setPreco(produto.getPreco());
        }
        produto.setQtnd(pd.getQtnd());
        produto.setPreco(pd.getPreco());
        return repo.save(produto);
    }
}
