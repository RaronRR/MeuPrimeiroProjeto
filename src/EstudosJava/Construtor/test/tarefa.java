package EstudosJava.Construtor.test;

import EstudosJava.Construtor.dominio.listaDeTarefas;

public class tarefa {
    public static void main(String [] args){
        listaDeTarefas listaDeTarefas = new listaDeTarefas("Estudar Java ", "31-08-2025", 1,false    );
        listaDeTarefas listaDeTarefas1 = new listaDeTarefas("Estudar Spring boot", "01-09-2025", 2, false    );
        listaDeTarefas listaDeTarefas2 = new listaDeTarefas("My Sql");
        listaDeTarefas listaDeTarefas3 = new listaDeTarefas("Estudar Git/GitHub");

        listaDeTarefas.exibirDetalhes();
        listaDeTarefas1.exibirDetalhes();
        listaDeTarefas2.exibirDetalhes();
        listaDeTarefas3.exibirDetalhes();

    }
}
