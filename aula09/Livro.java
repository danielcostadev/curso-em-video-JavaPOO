package aula09;

import java.util.Scanner;

public class Livro implements Publicacao{
    
    //Atributos
    private String titulo,autor,leitor;
    private int totPaginas,pagAtual;
    private boolean aberto;
    
    //Construtor

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.setAberto(false);
    }
    
    
    
    //Metodos 
    public void detalhes(){
        System.out.println("DETALHES DO LIVRO");
        System.out.println("-----------------");
        System.out.println("TITULO: "+this.getTitulo());
        System.out.println("AUTOR: "+this.getAutor());
        System.out.println("TOTAL DE PÁGINAS: "+this.getTotPaginas());
        System.out.println("PAGINA ATUAL: "+this.getPagAtual());
        System.out.println("ABERTO: "+this.isAberto());
        System.out.println("LEITOR(ES): "+this.getLeitor());
    }
    
    //Getters e Setters
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getTotPaginas(){
        return totPaginas;
    }
    
    public void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }
    
    public int getPagAtual(){
        return pagAtual;
    }
    
    public void setPagAtual(int pA){
        if(pA > this.getTotPaginas() || pA < 1){
            System.out.println("Não é possível realizar essa ação!");
        }else{
            this.pagAtual = pA;
            System.out.println("Agora você está na página: "+this.getPagAtual());
        }
    }
    
    public boolean isAberto(){
        return aberto;
    }
    
    public void setAberto(boolean aberto){
        this.aberto = aberto;
    }
    
    public String getLeitor(){
        return leitor;
    }
    
    public void setLeitor(String l){
        
        this.leitor = l;
    }
    
    //Metodos Abstraidos
    @Override
    public void abrir() {
        if(this.isAberto()){
            System.out.println("O livro "+this.getTitulo()+" já está aberto!");
        }else{
            this.setAberto(true);
            //this.setPagAtual(1);
            System.out.println("O livro "+this.getTitulo()+" acaba de ser aberto na página: "+this.getPagAtual());
        }
    }

    @Override
    public void fechar() {
        if(!this.isAberto()){
            System.out.println("O livro "+this.getTitulo()+" já está fechado!");
        }else{
            this.setAberto(false);
            System.out.println("O livro "+this.getTitulo()+" foi fechado com sucesso!");
        }
    }

    @Override
    public void folhear() {
        if(this.isAberto()){
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Digite o número da página desejada: ");
        int pagina = tec.nextInt();
        
        this.setPagAtual(pagina);
        }else{
            System.out.println("Para folhear as páginas o livro precisa estar aberto!");
        }
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            
            this.setPagAtual(this.getPagAtual()+1);
        }else{
            System.out.println("Para avançar o livro precisa estar aberto!");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            this.setPagAtual(this.getPagAtual()-1);
        }else {
            System.out.println("Para avançar o livro precisa estar aberto!");
        }
    }
    
    
       
    
}
