package com.example.APIVenda.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter  @Setter  @NoArgsConstructor  @AllArgsConstructor  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "vendas")
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomeProduto", nullable = false)
    private String nomeProduto;
    @Column(name = "nomeVendedor", nullable = false)
    private String nomeVendedor;
    @Column(name = "nomeCliente", nullable = false)
    private String nomeCliente;
    @Column(name = "valorVenda", nullable = false)
    private Double valorVenda;
    @Column(name = "data&hrVenda")
    private LocalDateTime date = LocalDateTime.now();
}
