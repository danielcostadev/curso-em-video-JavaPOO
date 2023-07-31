package ProjetoYoutube;

public class Visualizacao {
    //Atributos da Classe
    private Gafanhoto espectador;
    private Video filme;
    
    //Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);//Adiciona automáticamente +1 ao Total de vídeos assistidos pelo espectador
        this.filme.setViews(this.filme.getViews() +1);//Adiciona automáticamente +1 visualização ao vídeo
    }
    
    //Metodos da Classe
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        
        //Avaliação de acordo com a porcentagem do víde0 assistindo (em duração)
        
        int tot = 0;
        if(porc <= 20){
            tot = 2;
        }else if (porc <= 50){
            tot = 5;
        }else if (porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    //Metodos Especiais
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
