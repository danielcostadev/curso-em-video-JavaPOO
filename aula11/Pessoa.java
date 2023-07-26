package aula11;

public abstract class Pessoa {
    //Classe abstrata não pode ser instanciada, apenas herdada pelas subclasses
    
    // Atributos
    private String nome;
    private String sexo;
    private int idade;
    
    //Métodos
    
    public final void fazerAniversario(){
        // Método final não pode ser subescrito por outras classes
        this.setIdade(this.getIdade()+1);
    }
    
    // Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
