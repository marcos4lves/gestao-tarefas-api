package com.marcos4lves.gestao_tarefas.repository;
import com.marcos4lves.gestao_tarefas.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
