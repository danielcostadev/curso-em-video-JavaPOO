package aula11;

public class Tecnico extends Aluno {
    
    //Atributos
    private String registroProfissional;
    
    //Métodos
    public void praticar(){
        
    }
    
    //Métodos Especiais (Getters e Setters)
    public String getRegistroProfissional(){
        return registroProfissional;
    }
    
    public void setRegistroProfissional(String registroProfissional){
        this.registroProfissional = registroProfissional;
    }
}
