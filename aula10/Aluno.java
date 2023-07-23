package aula10;

public class Aluno extends Pessoa {
    
    //Atributos
    private boolean matriculado;
    private String curso;

    //Construtor
    public Aluno(String nome, String sexo, int idade, String curso,boolean matriculado) {
        super(nome, sexo, idade);
        this.curso = curso;
        this.matriculado = matriculado;
    }
    
    //Métodos
    public void cancelarMatricula(){
        this.matriculado = false;
        System.out.println("Matricula cancelada");
    }
    
    //Métodos especiais (Getters e Setters)
    public boolean isMatriculado(){
        return matriculado;
    }
    
    public void setMatriculado(boolean m){
        this.matriculado = m;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String c){
        this.curso = c;
    }
}
