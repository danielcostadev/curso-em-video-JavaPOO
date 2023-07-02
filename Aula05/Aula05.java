//package aula05;


public class Aula05 {

  
    public static void main(String[] args) {
        
        ContaBancaria p1 = new ContaBancaria();
        ContaBancaria p2 = new ContaBancaria();
        
        p1.setNumConta(1);
        p1.setDonoConta("Cliente1");
        p1.abrirConta("CP");
        p1.depositar(500);
        p1.infoConta();
        
        p2.setNumConta(2);
        p2.setDonoConta("Cliente2");
        p2.abrirConta("CC");
        p2.depositar(100);
        p2.infoConta();
        
 
    }   
    
}
