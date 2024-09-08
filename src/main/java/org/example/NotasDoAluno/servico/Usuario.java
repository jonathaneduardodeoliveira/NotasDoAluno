package org.example.NotasDoAluno.servico;

import java.util.Scanner;

public abstract class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public abstract void menu(Scanner scanner);
}
