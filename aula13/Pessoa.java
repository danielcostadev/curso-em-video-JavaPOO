package aula13;

public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected float peso;
    
    //Métodos
    public abstract void alimentar();
    public abstract void dormir();
    public abstract void locomover();
    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
