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
        c02.modelo = "Crown Master Chrome";
        c02.cor = "Azul";
        c02.tipo= "Esferográfica";
        c02.carga = 100;
        c02.ponta = 0.7f;
        c02.tampada = true;
        c02.status();
    }
    
}
