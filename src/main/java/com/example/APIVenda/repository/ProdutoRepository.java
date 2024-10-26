package com.example.APIVenda.repository;

import com.example.APIVenda.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    Produto findByNomeContaining(String nome);
}
