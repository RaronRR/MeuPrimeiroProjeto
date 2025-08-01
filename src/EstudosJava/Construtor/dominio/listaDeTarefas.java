package EstudosJava.Construtor.dominio;

public class listaDeTarefas {
    private String descricao;
    private String vencimento;
    private String prioridade;
    private boolean concluida = false;


    public listaDeTarefas(String descricao, String vencimento, int nivel, boolean concluida) {
        this.descricao = descricao;
        this.vencimento = vencimento;
        this.concluida = concluida;

        switch (nivel) {
            case 1:
                this.prioridade = "Nivel 01 - IMPORTANTE";
                break;
            case 2:
                this.prioridade = "Nivel 02 - MEDIANO";
                break;
            case 3:
                this.prioridade = "Nivel 03 - SIMPLE";
                break;
                default: this.prioridade = "Nivel deconhecido";
        }
    }

    public listaDeTarefas(String descricao) {
            this(descricao,"Não definido",2,false);
    }

    public void exibirDetalhes(){
        System.out.println("--------------------------");
        System.out.println("Tarefa: " + this.descricao);
        System.out.println("Prioridade: " + this.prioridade);
        System.out.println("Nivel: " + this.vencimento);
        System.out.println("Conclusão: " + this.concluida);
    }
    public String getDescricao() {
        return descricao;
    }
    public String getVencimento() {
        return vencimento;
    }
    public String getPrioridade() {
        return prioridade;
    }
    public boolean isConcluida() {
        return concluida;
    }



}

