package org.example.NotasDoAluno.servico;

import java.util.HashMap;
import java.util.Map;
import org.example.NotasDoAluno.modelo.Aluno;

public class AplicativoDeNotas {
    public static Map<String, Aluno> alunos = new HashMap<>();

    public static void inicializarDados() {
        Aluno aluno = new Aluno("jonathan", "curso de java", 0);
        alunos.put(aluno.getNome(), aluno);
    }
}
