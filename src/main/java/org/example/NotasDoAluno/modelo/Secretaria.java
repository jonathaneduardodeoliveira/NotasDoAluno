package org.example.NotasDoAluno.modelo;

import org.example.NotasDoAluno.servico.Usuario;
import org.example.NotasDoAluno.servico.AplicativoDeNotas;
import java.util.Scanner;

public class Secretaria extends Usuario {
    public Secretaria(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu da Secretaria:");
            System.out.println("1. Cadastrar Novo Aluno");
            System.out.println("2. Voltar ao Menu Principal");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    continuar = false; // Voltar ao menu principal
                    break;
                case 3:
                    System.exit(0); // Sair do aplicativo
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void cadastrarAluno(Scanner scanner) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o curso que o aluno vai cursar: ");
        String curso = scanner.nextLine();
        
        Aluno novoAluno = new Aluno(nome, curso, 0);
        
        AplicativoDeNotas.alunos.put(novoAluno.getNome(), novoAluno);
        
        System.out.println("Aluno cadastrado com sucesso!");
    }
}
