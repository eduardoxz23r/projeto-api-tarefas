package com.example.meu_primeiro_projeto;

import com.example.meu_primeiro_projeto.Tarefa;
import com.example.meu_primeiro_projeto.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @Autowired
    private TarefaRepository repository;

    @GetMapping("/cadastrar")
    public String salvar(@RequestParam String texto) {
        Tarefa t = new Tarefa();
        t.setDescricao(texto);
        repository.save(t);
        return "Sucesso! Salvei no banco: " + texto;
    }
}