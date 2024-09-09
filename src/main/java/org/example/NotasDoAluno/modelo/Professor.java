package org.example.NotasDoAluno.modelo;

import org.example.NotasDoAluno.servico.Usuario;
import org.example.NotasDoAluno.servico.AplicativoDeNotas;

import java.util.Map;
import java.util.Scanner;

public class Professor extends Usuario {
    public Professor(String nome, String senha) {
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
                    cadastrarNota(scanner);
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
        System.out.println("Menu do Professor:");
        System.out.println("1. Cadastrar Nota");
        System.out.println("2. Voltar ao Menu Principal");
        System.out.println("3. Sair");
    }

    private void cadastrarNota(Scanner scanner) {
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        Map<String, Aluno> alunos = AplicativoDeNotas.alunos;
        Aluno aluno = alunos.get(nomeAluno);

        if (aluno != null) {
            System.out.print("Digite a nota para o aluno " + nomeAluno + ": ");
            int nota = scanner.nextInt();
            scanner.nextLine();

            aluno.setNota(nota);
            System.out.println("Nota cadastrada com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
