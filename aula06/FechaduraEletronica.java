package aula06;

public class FechaduraEletronica implements Controlador {

    //Atributos
    private boolean ligado;
    private boolean aberto;
    private String senha;

    //Construtor
    public FechaduraEletronica() {
        this.setLigado(false);
        this.setAberto(false);
    }

    //Getters e Setters
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Métodos
    @Override
    public void ligar() {
        if (!(this.isLigado())) {
            this.setLigado(true);
            System.out.println("Fechadura Eletrônica ligada com sucesso!");
        } else {
            System.out.println("Impossível Ligar! A Fechadura Eletrônica já está ligada!");
        }
    }

    @Override
    public void desligar() {
        if (this.isLigado()) {
            this.setLigado(false);
            System.out.println("Fechadura Eletrônica desligada com sucesso!");
        } else {
            System.out.println("Impossível Desligar! A Fechadura Eletrônica já está desligada!");
        }

    }

    @Override
    public void abrirPorta() {
        if (this.isLigado()) {
            if (!(this.isAberto())) {
                this.verificarSenha();
            } else {
                System.out.println("Impossível Abrir! Fechadura Eletrônica já está aberta!");
            }
        } else {
            System.out.println("Impossível Abrir com a Fechadura Eletrônica desligada!");
        }
    }

    @Override
    public void fecharPorta() {
        if(this.isLigado()){
            if(this.isAberto()){
                this.setAberto(false);
                System.out.println("Fechadura Eletrônica Fechada com Sucesso!");
            }else{
                System.out.println("Impossível Fechar! Fechadura Eletrônica já está fechada!");
            }
        }else{
            System.out.println("Impossível Fechar com a Fechadura Eletrônica Desligada!");
        }
    }

    @Override
    public void inserirSenha(String s) {
        if (this.isLigado()){
            this.setSenha(s);
        }else{
           System.out.println("Impossível Inserir Senha com a Fechadura Eletrônica Desligada!");
        }
    }

    @Override
    public void verificarSenha() {
        if(this.getSenha()=="1234"){
            this.setAberto(true);
            System.out.println("Fechadura Eletrônica Aberta com Sucesso!");
        }else{
            System.out.println("A Senha para Abertura da Fechadura Eletrônica está incorreta");
        }
        
    }

}
