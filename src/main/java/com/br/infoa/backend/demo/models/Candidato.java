package com.br.infoa.backend.demo.models;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Indexed;

import com.br.infoa.backend.demo.DemoApplication;

@Entity
@Table
public class Candidato {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JoinTable
    @JoinColumn
    @ManyToMany

    @Column(name="id")
	Integer id;

    @Column(name="nome")
	String nome;

    @Column(name="status")
    String cpf;

    @Column(name="status")
    String telefone;

    private List<Vaga> vagas;

    public Candidato() {
    }

    public Candidato(String cpf, Integer id, String nome, String telefone, List<Vaga> vagas) {
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.vagas = vagas;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }


	
}