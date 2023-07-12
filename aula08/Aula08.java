package aula08;

public class Aula08 {

    public static void main(String[] args) {
        Lutador lut[] = new Lutador[6];
                
        lut[0] = new Lutador("Xing Li","China",31,1.89f,68.9f,10,4,1);
        lut[1] = new Lutador("Poo","Holanda",29,1.78f,57.8f,17,6,0);
        lut[2] = new Lutador("MidNight","EUA",35,1.64f,80.9f,12,2,1);
        lut[3] = new Lutador("Horlando","México",28,1.90f,81.6f,13,0,2);
        lut[4] = new Lutador("Unico","Equador",37,1.80f,119.3f,5,4,3);
        lut[5] = new Lutador("Antonio","Brasil",30,1.75f,105.7f,12,2,4);
             
        Luta card1 = new Luta();
        card1.marcarLuta(lut[0], lut[1]);
        card1.apresentacao("Primeiro Card");
        card1.lutar();
        
    }
    
}
