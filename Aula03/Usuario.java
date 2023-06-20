// Código desenvolvido com o conhecimento adiquirido na Aula03 do Curso de JavaPOO
// Curso em Vídeo - Professor Gustavo Guanabara

// package cadastrousuario;

import java.util.Scanner;

public class Usuario {
    
    //Atributos
    
    /* Como se trata de uma classe relacionada ao cadastro básico de usuários
    os atributos foram declarados com visibilidade privada (private) para que
    só os metódos da classe possam fazer alterações nos mesmos  */ 

    private String usuario; 
    private String senha;
    private String cadastrado;
    
    //Metodos
    public void criarUsuario(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um nome para usuário: ");
        this.usuario = teclado.nextLine();
        System.out.print("Digite uma senha para seu usuario: ");
        this.senha = teclado.nextLine();
      
        cadastrado = (!this.usuario.equals("")&&!this.senha.equals(""))?this.usuario+""
                + " Cadastrado com sucesso!":"Por favor digite os dados corretamente!";
        
        System.out.println(cadastrado);
    
    }  
}
