package aula10;

public class Funcionario extends Pessoa {
    
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Construtor
    public Funcionario(String nome, String sexo, int idade, String setor, boolean trabalhando) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    
    //Métodos
    public void sairDoTrabalho(){
        this.trabalhando = false;
    }
    
    //Métodos Especiais (Getters e Setters)
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String s){
        if (this.trabalhando){
            this.setor = s;
        }
    }
    
    public boolean isTrabalhando(){
        return trabalhando;
    }
    
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }
    
}
