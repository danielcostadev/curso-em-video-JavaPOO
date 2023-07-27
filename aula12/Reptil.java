package aula12;

public class Reptil extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Métodos abstratos Sobrepostos da Superclasse
    @Override
    public void locomover() {
        System.out.println("Rastejar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
    
}
