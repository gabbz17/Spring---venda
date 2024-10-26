package com.example.APIVenda.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter  @Setter  @NoArgsConstructor  @AllArgsConstructor  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;
    @Column(name = "quantidade", nullable = false)
    private Integer qtnd;
    @Column(name = "preco", nullable = false)
    private Double preco;

}
