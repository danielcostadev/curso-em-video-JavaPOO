package aula11;

public class Aula11 {

    public static void main(String[] args) {
        
        Bolsista estudante01 = new Bolsista();
        estudante01.setNome("Daniel");
        estudante01.setBolsa(10.5f);
        estudante01.pagarMensalidade();
        estudante01.renovarBolsa();
        
        
        Professor p1 = new Professor();
        p1.setNome("Pedro");
        p1.setEspecialidade("Doutor");
        p1.setIdade(32);
        p1.setSalario(2000f);
        p1.receberAumento();
        p1.receberAumento();
    }
    
}
