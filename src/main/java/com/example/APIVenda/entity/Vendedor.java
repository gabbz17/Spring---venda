package com.example.APIVenda.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter  @Setter  @NoArgsConstructor  @AllArgsConstructor  @EqualsAndHashCode(of = "id")
@Entity
@Table(name = "vendedor")
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;
    @Column(name = "numero", nullable = false, unique = true, length = 15)
    private String numero;
    @Column(name = "residencia", nullable = false)
    private String residencia;
    @Column(name = "salario", nullable = false)
    private Double salario;


}
