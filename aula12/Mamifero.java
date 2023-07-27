package aula12;

public class Mamifero extends Animal{
    
    //Atributos
    private String corPelo;
    
    //Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //Métodos abstratos Sobrepostos da Superclasse
    @Override
    public void locomover() {
        System.out.println("Correr");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
}
