package aula06;
public class Aula06 {

    public static void main(String[] args) {
        FechaduraEletronica porta1 = new FechaduraEletronica();
        
        porta1.ligar();
        porta1.inserirSenha("1234");
        porta1.abrirPorta();
        porta1.fecharPorta();
        
    }
    
}
