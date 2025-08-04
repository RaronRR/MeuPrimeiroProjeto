package EstudosJava.Construtor.test;

import EstudosJava.Construtor.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno01 = new Aluno("Joao da Silva", "12345");
        Aluno aluno02 = new Aluno("Maria Souza", "54321", "Engenharia",0.0);

        aluno01.StatusAluno();
        aluno02.StatusAluno();




    }
}
