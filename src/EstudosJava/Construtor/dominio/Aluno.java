package EstudosJava.Construtor.dominio;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private double notaMedia;
    private boolean ativo;

    public Aluno() {
        this.nome = "Não informado";
        this.matricula = "00000";
        this.curso = "Não atualizado";
        this.notaMedia = 0.0;
        this.ativo = true;
        System.out.println("Aluno inicializado com valor padrão");

    }
    public Aluno(String nome, String matricula, String curso, double notaMedia) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notaMedia = notaMedia;
        this.ativo = false;
    }
    //
    public Aluno(String nome, String matricula) {
        this(nome, matricula, "Geral",0.0 );
        System.out.println("Aluno essencial criado:");
    }
    //
    public void StatusAluno() {
        String ativo;
        if(this.ativo){
            ativo = "Ativo";
        }else{
            ativo = "Inativo";
        }
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("Nota media: " + this.notaMedia);
        System.out.println("Ativo: " + ativo);
        System.out.println("------------------------------------");
    }

}


