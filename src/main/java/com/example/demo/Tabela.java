package com.example.demo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String campo1;
    @Column
    private String campo2;
    @Column
    private BigDecimal campo3;

}
