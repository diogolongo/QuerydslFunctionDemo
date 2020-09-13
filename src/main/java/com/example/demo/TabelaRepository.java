package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface TabelaRepository extends JpaRepository<Tabela, Integer>, QuerydslPredicateExecutor<Tabela> {
}
