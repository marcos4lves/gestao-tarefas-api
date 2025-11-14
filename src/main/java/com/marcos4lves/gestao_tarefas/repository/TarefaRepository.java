package com.marcos4lves.gestao_tarefas.repository;
import com.marcos4lves.gestao_tarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TarefaRepository extends JpaRepository <Tarefa, Long>{
}
