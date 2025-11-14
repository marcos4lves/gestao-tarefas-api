package com.marcos4lves.gestao_tarefas.entity;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name="usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length =100)
    private String nome;

    @Column (unique = true, nullable = false, length = 255)
    private String email;

    // Construtor vazio (obrigatório para o JPA)
    public Usuario (){
    }

    public Usuario (String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters

    public Long getId() {return id; }
    public void setId(Long id) { this.id = id;}

    public String getNome() { return nome; }
    public void stNom(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }



}
