package aula12;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos da Classe
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

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
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
    
    
}
