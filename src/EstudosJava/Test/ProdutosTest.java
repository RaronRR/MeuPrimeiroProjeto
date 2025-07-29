package EstudosJava.Test;

import EstudosJava.Domain.Produto;

public class ProdutosTest {
    public static void main(String [] args){
        Produto produto01 = new Produto();
        produto01.nome = "leite";
        produto01.codigo = "leite";
        produto01.preco = 6.59;
        produto01.quantidadeEmEstoque = 10;

        produto01.exibirInformacoes();
        produto01.reporEstoque(10);
        produto01.vender(21);


    }
}

