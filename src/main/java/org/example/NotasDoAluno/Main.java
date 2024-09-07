package org.example.NotasDoAluno;

import org.example.NotasDoAluno.modelo.Aluno;
import org.example.NotasDoAluno.modelo.Professor;
import org.example.NotasDoAluno.modelo.Secretaria;
import org.example.NotasDoAluno.servico.AplicativoDeNotas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AplicativoDeNotas.inicializarDados();

        while (true) {
            System.out.println("Login:");
            System.out.println("1. Secretaria");
            System.out.println("2. Professor");
            System.out.println("3. Aluno");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (login(scanner, "ada", "b3")) {
                        Secretaria secretaria = new Secretaria("Secretaria", "b3");
                        secretaria.menu(scanner);
                    } else {
                        System.out.println("Usuário ou senha inválidos.");
                    }
                    break;
                case 2:
                    if (login(scanner, "rocha", "b3")) {
                        Professor professor = new Professor("Professor Rocha", "b3");
                        professor.menu(scanner);
                    } else {
                        System.out.println("Usuário ou senha inválidos.");
                    }
                    break;
                case 3:
                    if (login(scanner, "jonathan", "b3")) {
                        Aluno aluno = new Aluno("Jonathan", "curso de java", 0);
                        aluno.menu(scanner);
                    } else {
                        System.out.println("Usuário ou senha inválidos.");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static boolean login(Scanner scanner, String nomeCorreto, String senhaCorreta) {
        System.out.print("Nome de usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        return nome.equals(nomeCorreto) && senha.equals(senhaCorreta);
    }
}
