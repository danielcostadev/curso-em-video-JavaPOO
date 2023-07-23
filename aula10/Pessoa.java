package aula10;

public class Pessoa {
    
    //Atributos
    private String nome,sexo;
    private int idade;
    
    //Métodos
    public void fazerAniv(){
        this.idade++;
    }
    
    //Construtor

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
       
    //Métodos Especiais (Getters e Setters)
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
}
