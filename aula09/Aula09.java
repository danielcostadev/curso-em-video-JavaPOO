package aula09;

public class Aula09 {

    public static void main(String[] args) {
        
        Pessoa[] pess = new Pessoa[3];
        
        pess[0] = new Pessoa("Daniel","M",32);
        pess[1] = new Pessoa("Pedro","M",1);
        pess[2] = new Pessoa("Maria","F",7);
        
        Livro[] liv = new Livro[3];
        
        liv[0] = new Livro("Era uma Vez","JotaK",100);
        
        liv[0].setLeitor(pess[0].getNome()+" | "+pess[1].getNome());
        liv[0].abrir();
        //liv[0].folhear();
        //for(int c = 1; c < liv[0].getTotPaginas();c++){
        //liv[0].avancarPag();
            //System.out.println(c);
        //}    
        //liv[0].avancarPag();
        
        //liv[0].fechar();
    }
    
}
