package aula02;

public class Aula02 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Caneta c01 = new Caneta();
        c01.modelo = "Bic";
        c01.cor = "Preta";
        c01.tipo= "Esferográfica";
        c01.carga = 100;
        c01.ponta = 0.5f;
        c01.tampada = false;
        c01.status();
        
        Caneta c02 = new Caneta();
        
        c01.modelo = "Compactor";
        c01.cor = "Azul";
        c01.tipo= "Esferográfica";
        c01.carga = 40;
        c01.ponta = 0.7f;
        c01.tampada = true;
        c01.status();
        
    }
    
}
