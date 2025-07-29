package EstudosJava.Domain;

public class Alunos {
    public String nome;
    public int idade;
    public char turma;
    public int serie;

        public void Mostrar(){
            System.out.println("____________________________");
            System.out.println("Nome do primeiro aluno: " + this.nome);
            System.out.println("Idade: " + this.idade);
        }
}
