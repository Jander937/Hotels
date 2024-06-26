package com.co.buritica.hotels.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_tipos_documento")
public class DocumentTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "sigla")
    private String initials;
}
