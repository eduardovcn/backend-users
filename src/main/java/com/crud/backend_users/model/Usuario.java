package com.crud.backend_users.model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // Indica uma entidade JPA, ou seja, uma tabela no banco de dados.
public class Usuario {

    @Id // Indica que o campo 'id' é a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor do 'id' será gerado automaticamente pelo banco de dados.
    private int id;

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataCadastro;

    // Contrutores
    public Usuario() {}

    public Usuario(String nome, String email, String telefone) {
        // Construtor sem o campo 'id', pois ele será gerado automaticamente.
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataCadastro = LocalDate.now(); // Define a data de cadastro como a data atual
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
