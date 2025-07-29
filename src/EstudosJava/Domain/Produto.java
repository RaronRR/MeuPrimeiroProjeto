package EstudosJava.Domain;

public class Produto {
    public String nome;
    public String codigo;
    public double preco;
    public int quantidadeEmEstoque;

        public void exibirInformacoes(){
            System.out.println("Produto: " + this.nome);
            System.out.println("Codigo: " + this.codigo);
            System.out.println("Preço: "+ this.preco);
            System.out.println("Quantidade em estoque: " + this.quantidadeEmEstoque);
            System.out.println("---------------------------");
        }
        public void reporEstoque(int quantidade){
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Quantidade em estoque atual: " + this.quantidadeEmEstoque);
        }
        public void vender(int quantidade){
            if (this.quantidadeEmEstoque >= quantidade){
                this.quantidadeEmEstoque -= quantidade;
                System.out.println(quantidade + " vedida com sucesso");
                System.out.println("Quantidade atual: " + quantidadeEmEstoque);
            }else {
                System.out.println("Quantidade indisponivel " + quantidadeEmEstoque);
            }


        }







}
