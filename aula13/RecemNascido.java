package aula13;

public class RecemNascido extends Crianca{
    
    //Métodos Sobrepostos da SuperClasse
    @Override
    public void alimentar(){
        System.out.println("Mamar");
    }
    
    @Override
    public void dormir(){
        System.out.println("Estou dormindo, sou um bebe");
    }
    
    //Polimorfismo por sobrecarga
    public void reagir(String pais){
        if ("Mae".equals(pais)){
            System.out.println("O bebe está sorrindo");
        } else if ("Pai".equals(pais)){
            System.out.println("O bebe está dizendo: -PAPA, PAPA");
        }else {
            System.out.println("O bebe está chorando!");
        }
    }
    
    public void reagir(boolean fome){
        if (fome){
            alimentar();
        }else {
            dormir();
        }
    }
}
