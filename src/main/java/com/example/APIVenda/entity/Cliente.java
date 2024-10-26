package com.example.APIVenda.entity;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.*;

@Getter  @Setter  @NoArgsConstructor  @AllArgsConstructor  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "numero", nullable = false, unique = true, length = 15)
    private String numero;
}
