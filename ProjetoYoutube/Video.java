package ProjetoYoutube;

public class Video implements AcoesVideo{
    //Atributos da Classe
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    //Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    //Metodos abstratos implementados da Interface
    @Override
    public void play() {
        if(!this.isReproduzindo()){
            this.setReproduzindo(true);
            System.out.println("O vídeo "+this.getTitulo()+" começou a ser reproduzido!");
        }else{
            System.out.println("O vídeo "+this.getTitulo()+" já está sendo reproduzido!");
        }
    }

    @Override
    public void pause() {
        if (this.isReproduzindo()) {
            this.setReproduzindo(false);
            System.out.println("O vídeo "+this.getTitulo()+" foi pausado com sucesso!");
        } else {
            System.out.println("O vídeo "+this.getTitulo()+" já está pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }
    
    //Metodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        
        float nova; //Variavel auxiliar para calcular média
        nova = (this.avaliacao + avaliacao)/this.getViews();//Faz o calculo da média das avaliações
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + 
                avaliacao + ", views=" + views + ", curtidas=" + 
                curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
}
