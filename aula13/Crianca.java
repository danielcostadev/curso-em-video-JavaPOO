package aula13;

public class Crianca extends Pessoa{
    //Atributos
    private String escolaridade;

    //Métodos Especiais
    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    
    //Métodos Sobrepostos da SuperClasse
    @Override
    public void alimentar() {
        System.out.println("Lanche");
    }

    @Override
    public void dormir() {
        System.out.println("Estou dormindo, sou uma criança");
    }

    @Override
    public void locomover() {
        System.out.println("Correr");
    }
    
}
