package aula06;

public interface Controlador {
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirPorta();
    public abstract void fecharPorta();
    public abstract void inserirSenha(String s);
    public abstract void verificarSenha();
    
}
