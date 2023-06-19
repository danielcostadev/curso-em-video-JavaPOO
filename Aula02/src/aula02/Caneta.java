package aula02;

public class Caneta {

    // Atributos
    
    String modelo;
    String cor;
    String tipo;
    float ponta;
    int carga;
    boolean tampada;

    // Metodos
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("A caneta " +this.modelo + " é do tipo: " + this.tipo);
        System.out.println("Espessura da ponta: "+ this.ponta + "mm");
        System.out.println("Quantidade de tinta da caneta: "+ this.carga + "%");
        System.out.println("A caneta " + this.modelo + " está tamapada? " + this.tampada);
        System.out.println("----------------------------------------------------");
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não é possível rabiscar. Pois" + this.modelo + " está tampada!");
        } else {
            System.out.println("Rabisco feito com SUCESSO!");
        }
    }

    void tampar() {
        if (this.tampada == true) {
            System.out.println("A caneta " + this.modelo + " já está tampada!");
        } else {
            System.out.println("Caneta " + this.modelo + " foi tampada com SUCESSO!");
        }
        this.tampada = true;
    }

    void destampar() {
        if (this.tampada == false) {
            System.out.println("A caneta " + this.modelo + " já está destampada!");
        } else {
            System.out.println("Caneta " + this.modelo + " foi destampada com SUCESSO!");
        }
        this.tampada = false;
    }

}
