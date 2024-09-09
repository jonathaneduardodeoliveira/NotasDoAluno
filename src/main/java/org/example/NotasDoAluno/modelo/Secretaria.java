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
            exibirMenu();
            int opcao = 0;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.nextLine(); // Limpar o buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    continuar = false;
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void exibirMenu() {
        System.out.println("Menu da Secretaria:");
        System.out.println("1. Cadastrar Novo Aluno");
        System.out.println("2. Voltar ao Menu Principal");
        System.out.println("3. Sair");
    }

    private void cadastrarAluno(Scanner scanner) {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        if (AplicativoDeNotas.alunos.containsKey(nome)) {
            System.out.println("Aluno já cadastrado.");
            return;
        }

        System.out.print("Digite o curso que o aluno vai cursar: ");
        String curso = scanner.nextLine();

        Aluno novoAluno = new Aluno(nome, curso, 0);
        AplicativoDeNotas.alunos.put(novoAluno.getNome(), novoAluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }
}
