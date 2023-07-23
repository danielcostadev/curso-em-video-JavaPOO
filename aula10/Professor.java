package aula10;

public class Professor extends Pessoa{
    
    //Atributos
    private String especialidade;
    private float salario;
    
    //Construtor
    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }
    
    //Métodos
    public void receberAum(){
        this.salario = this.salario + 100;
    }
    
    //Métodos Especiais (Getters e Setters)
    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float s){
        this.salario = s;
    }
    
}
