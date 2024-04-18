package com.cesar.dragonball.backend.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "raza")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotEmpty
    @Size(min = 4, max = 50)
    @Column(name = "nombre",nullable = false, length = 50)
    private String nombre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_universo", referencedColumnName = "id", foreignKey = @ForeignKey(name = "id_universo_FK"))
    private Universo universo;
}
