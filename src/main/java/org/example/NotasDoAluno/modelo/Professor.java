package org.example.NotasDoAluno.modelo;

import org.example.NotasDoAluno.servico.Usuario;
import org.example.NotasDoAluno.servico.AplicativoDeNotas;
import java.util.Scanner;
import java.util.Map;

public class Professor extends Usuario {
    public Professor(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu do Professor:");
            System.out.println("1. Cadastrar Nota");
            System.out.println("2. Voltar ao Menu Principal");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

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
