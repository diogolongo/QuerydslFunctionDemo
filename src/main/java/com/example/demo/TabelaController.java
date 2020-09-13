package com.example.demo;

import com.querydsl.core.types.dsl.BooleanTemplate;
import com.querydsl.core.types.dsl.Expressions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
@RequestMapping("/api")
public class TabelaController {

    @Autowired
    private TabelaRepository repository;
    @Autowired
    private EntityManager entityManager;

    @GetMapping(path = "/")
    public ResponseEntity<Iterable<Tabela>> find(@RequestParam String pesquisa){
        BooleanTemplate booleanTemplate = Expressions.booleanTemplate("function('match',campo1, campo2, {0}) > 0", "+"+pesquisa+"*");
        Iterable<Tabela> all = repository.findAll(booleanTemplate);
        return ResponseEntity.ok(all);
    }
    @PostMapping("/")
    public void insere(@RequestBody Tabela tabela){
        repository.save(tabela);
    }

}
