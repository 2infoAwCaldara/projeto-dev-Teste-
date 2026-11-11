package com.br.infoa.backend.demo.models;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Indexed;

import com.br.infoa.backend.demo.DemoApplication;

@Entity
@Table = (name = "Vaga")
public class Empresa {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn
    @ManyToMany
	
    @Column(name="id")
    private Integer id;
	
    @Column(name="nome")
    private String nome;

    @Column(name="status")
	private String area;

    private List<Candidato> candidato;

    public Empresa() {
    }

    public Empresa(String area, List candidato, Integer id, String nome) {
        this.area = area;
        this.candidato = candidato;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List getCandidato() {
        return candidato;
    }

    public void setCandidato(List candidato) {
        this.candidato = candidato;
    }


}
