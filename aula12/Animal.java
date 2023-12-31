package aula12;

public abstract class Animal {
    
    //Atributos
    protected float peso;
    protected int idade;
    protected int membro;
    
    //Métodos Abstratos 
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //Métodos Especiais
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembro() {
        return membro;
    }

    public void setMembro(int membro) {
        this.membro = membro;
    }
    
 
}
