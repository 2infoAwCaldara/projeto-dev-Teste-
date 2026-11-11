package com.br.infoa.backend.demo.models;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Indexed;

import com.br.infoa.backend.demo.DemoApplication;

@Entity
@Table
public class Empresa {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	Integer id;
	
	@Column(name="nome")
	String nome;

    public Empresa() {
    }

    public Empresa(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
	
	
}

