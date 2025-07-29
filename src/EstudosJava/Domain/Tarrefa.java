package EstudosJava.Domain;

public class Tarrefa {
    private String descricao;
    private String dataVencimento;
    private boolean concluido = false;

        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        public void setDataVencimento(String dataVencimento){
            this.dataVencimento = dataVencimento;
        }

        //
        //
        public String getDescricao(String descricao){
           return this.descricao = descricao;
        }
        public String getDataVencimento(String dataVencimento){
            return this.dataVencimento = dataVencimento;
        }
        public boolean getConcluido(boolean concluido){
            return this.concluido = concluido;
        }
        //
        //
        public void marcarCocluido(){
            this.concluido = true;
            System.out.println("Tarefa " + this.descricao + " Esta concluida");
        }

        public void exibirStatus(){
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Tarefa: " + this.descricao +"\n Vencimento: "+ this.dataVencimento +"\n Status: "+ this.concluido);


            }
        }

