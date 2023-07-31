package ProjetoYoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Narnia");
        v[1] = new Video("Matrix");
        v[2] = new Video("Carros");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Daniel", 32, "M", "dani");
        g[1] = new Gafanhoto("Ninguem", 44, "M", "noone");
        
        Visualizacao view[] = new Visualizacao[10];
        
        view[0] = new Visualizacao(g[0],v[1]);
        view[0].avaliar(10);
        System.out.println(view[0].toString());
        view[1] = new Visualizacao(g[0],v[1]);
        view[1].avaliar(2);
        System.out.println(view[1].toString());
        
        
        /*System.out.println("VIDEOS\n------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        

    }
    
}
