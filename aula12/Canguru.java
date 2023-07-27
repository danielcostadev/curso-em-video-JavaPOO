package aula12;

public class Canguru extends Mamifero{
    
    //Métodos da Classe
    public void usarbolsa(){
        System.out.println("Bolsa sendo usada");
    }
    
    //Métodos abstratos Sobrepostos da Superclasse
    @Override
    public void locomover(){
        System.out.println("Saltar");
    }
    
}
