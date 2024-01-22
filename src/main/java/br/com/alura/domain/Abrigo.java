package br.com.alura.domain;

import java.util.Arrays;

public class Abrigo {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public Abrigo() {

    }
    public Abrigo(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Pet[] getPets() {
        return pets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"nome\":\"" + nome + "\"," +
                "\"telefone\":\"" + telefone + "\"," +
                "\"email\":\"" + email + "\"," +
                "\"pets\":" + Arrays.toString(pets) +
                "}";
    }
}
