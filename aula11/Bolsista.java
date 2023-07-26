package aula11;

public class Bolsista extends Aluno{
    
    //Atributos
    private float bolsa;
    private boolean statusBolsa;
    
    //Métodos 
    public void renovarBolsa(){
        
        if(this.isStatusBolsa()){
            System.out.println("A bolsa com desconto de "+this.getBolsa()+"% para "+this.getNome()+" foi renovada com SUCESSO!");
        }else{
            System.out.println("Sua bolsa não pode ser renovada no momento, confira se os pagamentos estão em dias.");
        }
    }
    
    @Override
    public void pagarMensalidade(){
        
        this.setSatusBolsa(true); // Torna o Status da Bolsa em Verdadeiro
        System.out.println("A mensalidade do bolsista "+this.getNome()+" foi paga com SUCESSO!");
        
    }
    
    //Métodos Especiais (Getters e Setters)
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    public boolean isStatusBolsa(){
        return statusBolsa;
    }
    
    public void setSatusBolsa(boolean statusBolsa){
        this.statusBolsa = statusBolsa;
    }
           
}
