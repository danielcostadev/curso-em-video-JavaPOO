package aula10;

public class Aula10 {

    public static void main(String[] args) {
        
        Pessoa pessoa01 = new Pessoa("Maria","M",39);
        Aluno pessoa02 = new Aluno("Daniel","M",32,"Ciência da Computação",true);
        Professor pessoa03 = new Professor("Gustavo","M",45,"Mestre em Educação",2400f);
        Funcionario pessoa04 = new Funcionario("Josefa","F",50,"Auxiliar de Educação Básica",true);
        
        //Testando detalhes ds pessoas
        System.out.println("Olá meu nome é "+pessoa01.getNome()+" tenho "+pessoa01.getIdade()+" anos");
        System.out.println("Olá meu nome é "+pessoa02.getNome()+" tenho "+pessoa02.getIdade()+" anos"+
                " estou estudando "+pessoa02.getCurso());
        System.out.println("Olá meu nome é "+pessoa03.getNome()+" tenho "+pessoa03.getIdade()+" anos"+
                " sou "+pessoa03.getEspecialidade());
        System.out.println("Olá meu nome é "+pessoa04.getNome()+" tenho "+pessoa04.getIdade()+" anos"+
                " minha função é "+pessoa04.getSetor());
        
        pessoa01.fazerAniv();
        System.out.println("A nova idade de "+pessoa01.getNome()+" é: "+pessoa01.getIdade());
        
        pessoa02.cancelarMatricula();
        System.out.println("O Status da matricula de: "+pessoa02.getNome()+" é: "+pessoa02.isMatriculado());

        
    }
    
}