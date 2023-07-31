package ProjetoYoutube;

public class Gafanhoto extends Pessoa{
    //Atributos da Classe
    private String login;
    private int totAssistido;

    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Metodos da Classe
    public void viuMaisUm(){
        
        this.setTotAssistido(this.getTotAssistido()+1);
        
    }
    
    //Metodos abstratos implementados da SuperClasse
    @Override
    protected void ganharExperiencia() {
        
    }

    //Metodos Especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
