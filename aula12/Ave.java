package aula12;

public class Ave extends Animal{
    //Atributos
    private String corPena;
    
    //Métodos da Classe
    public void fazerNinho(){
        System.out.println("Fez um Ninho");
    }
    
    //Métodos Especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //Métodos abstratos Sobrepostos da Superclasse
    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer Sementes e Frutos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piar");
    }
    
}
