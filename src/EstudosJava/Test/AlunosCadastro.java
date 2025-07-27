package EstudosJava.Test;

import EstudosJava.Domain.Alunos;

public class AlunosCadastro {
    public static void main(String [] args){
        Alunos alunos01 = new Alunos();
        Alunos alunos02 = new Alunos();
        Alunos alunos03 = new Alunos();

        alunos01.nome = "Raron";
        alunos02.nome = "Josiane";
        alunos03.nome = "Gabriel";

       alunos01.Mostrar();

    }
}
