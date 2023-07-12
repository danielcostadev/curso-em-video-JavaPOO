package aula07;

public class Lutador {

    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    // Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {

        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);

    }

    // Metódos Públicos
    public void apresentar() {

        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Com " + this.getAltura() + "m de altura!");
        System.out.println(this.getIdade() + " anos");
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Apresentamos " + this.getNome());
        System.out.println("");
        System.out.println("APROVEITAMENTO:");
        System.out.println("-----------------------------");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("---------------------------------------");

    }

    public void status() {
        System.out.println("---------------------------------------");
        System.out.println(getNome() + " SCORE DE LUTAS: ");
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta() {
        System.out.println(this.getNome() + " GANHOU a luta!");
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        System.out.println(this.getNome() + " PERDEU a luta!");
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        System.out.println(this.getNome() + " EMPATOU a luta!");
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metódos Especiais: Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (this.getPeso() < 50 || this.getPeso() > 120) {
            this.categoria = "PESO INVÁLIDO";
        } else if (this.getPeso() <= 70) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 100) {
            this.categoria = "Peso Médio";
        } else {
            this.categoria = "Peso Pesado";
        }

    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
