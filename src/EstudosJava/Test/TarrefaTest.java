package EstudosJava.Test;

import EstudosJava.Domain.Tarrefa;

public class TarrefaTest {
    public static void main(String [] args){
        Tarrefa tarrefa01 = new Tarrefa();
        Tarrefa tarrefa02 = new Tarrefa();
        tarrefa01.setDescricao("Compra Leite");
        tarrefa01.setDataVencimento("30-07-2025");


        tarrefa01.marcarCocluido();
        tarrefa01.exibirStatus();
        //
        tarrefa02.setDescricao("Compar café");
        tarrefa02.setDataVencimento("30-07-2025");
        tarrefa02.exibirStatus();



    }


}
