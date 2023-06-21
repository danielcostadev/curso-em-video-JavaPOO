// Código desenvolvido com o conhecimento adiquirido na Aula04 do Curso de JavaPOO
// Curso em Vídeo - Professor Gustavo Guanabara

//package aula04;

public class Usuario {
    
    // Atributos
    
    private final int id;
    private final double ale;
    private String usuario;
    private String senha;
    
    // Construtor
    
    public Usuario(String u, String p){
        ale = Math.random();
        this.id = (int)(1 + ale * (1000000-1));
        this.setUsuario(u);
        this.setSenha(p);
    }
    
    // Getters e Setters
    
    public int getId(){
        return this.id;
    }    
    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String user){
        this.usuario = user;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String pass){
        this.senha = pass;
    }
   
    public void getStatus(){
        System.out.println("ID: "+this.getId());
        System.out.println("USUÁRIO: "+this.getUsuario());
        System.out.println("SENHA: "+this.getSenha());
    }
    
}
