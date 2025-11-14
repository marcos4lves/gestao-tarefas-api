package com.marcos4lves.gestao_tarefas.controller;

import com.marcos4lves.gestao_tarefas.entity.Tarefa;
import com.marcos4lves.gestao_tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaRepository tarefaRepository;
    @GetMapping
    public List<Tarefa> listarTarefas(){
        return tarefaRepository.findAll();
    }
    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
        tarefa.setTitulo(tarefaAtualizada.getTitulo());
        tarefa.setDescricao(tarefaAtualizada.getDescricao());
        tarefa.setStatus(tarefaAtualizada.getStatus());
        return tarefaRepository.save(tarefa);
    }
    @DeleteMapping("/{id}")
    public String deletarTarefa(@PathVariable Long id){
        tarefaRepository.deleteById(id);
        return "Tarefa " + id + " deletada com sucesso!";
    }
}
