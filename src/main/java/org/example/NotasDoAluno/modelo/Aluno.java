package org.example.NotasDoAluno.modelo;

import org.example.NotasDoAluno.servico.Usuario;
import org.example.NotasDoAluno.servico.AplicativoDeNotas;
import java.util.Scanner;

public class Aluno extends Usuario {
    private String curso;
    private int nota;

    public Aluno(String nome, String curso, int nota) {
        super(nome, "senha");
        this.curso = curso;
        this.nota = nota;
    }

    @Override
    public void menu(Scanner scanner) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu do Aluno:");
            System.out.println("1. Ver Nota");
            System.out.println("2. Voltar ao Menu Principal");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    consultarNota(scanner);
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

    private void consultarNota(Scanner scanner) {
        System.out.print("Digite o nome do aluno para consultar a nota: ");
        String nomeAluno = scanner.nextLine();

        Aluno aluno = AplicativoDeNotas.alunos.get(nomeAluno);

        if (aluno != null) {
            System.out.println("A nota do aluno " + nomeAluno + " é: " + aluno.getNota());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
