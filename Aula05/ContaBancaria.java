//package aula05;

public class ContaBancaria {

    // Atributos

    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldoConta;
    private boolean statusConta;

    // Métodos
    public void abrirConta(String t) {
                
        this.setStatusConta(true);
        this.setTipoConta(t);
        if (this.getTipoConta() == "CC") {
            this.setSaldoConta(50);
        } else if (this.getTipoConta() == "CP") {
            this.setSaldoConta(150);
        }
        System.out.println("-------------------------------------");
        System.out.println("A Conta de "+this.getDonoConta()+" foi aberta com sucesso!");
        
    }

    public void fecharConta() {

        if (getStatusConta()) {
            if (this.getSaldoConta() > 0) {
                System.out.println("A conta não pode ser fechada, pois possui saldo!");

            } else if (this.getSaldoConta() < 0) {
                System.out.println("A conta possui débitos em aberto, por favor regularize!");

            } else {
                this.setStatusConta(false);
                System.out.println("Conta fechada com sucesso!");

            }
        } else {
            System.out.println("A conta já está fechada!");
        }
    }

    public void depositar(float v) {

        if (this.getStatusConta()) {
            this.setSaldoConta(this.getSaldoConta() + v);
        } else {
            System.out.println("Impossível depositar");
        }
        System.out.println("Depósito no valor de R$"+v+" realizado com sucesso na conta de "+this.getDonoConta());

    }

    public void sacar(float v) {

        if (this.getStatusConta()) {
            if (v <= this.getSaldoConta()) {
                this.setSaldoConta(this.getSaldoConta() - v);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível Sacar!");
        }
        System.out.println("Saque no valor de R$"+v+" realizado com sucesso na conta de "+this.getDonoConta());

    }

    public void pagarMensalidade() {

        if (this.getStatusConta()) {
            float v = 0;
            if (this.getTipoConta() == "CC") {
                v = 12;
            } else if (this.getTipoConta() == "CP") {
                v = 20;
            }
            if (this.getStatusConta()){
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Mensalidade paga com sucesso por "+this.getDonoConta());
            }else{
                System.out.println("Impossível pagar mensalidade com a conta fechada!");
            }
        }
    }
    
    public void infoConta(){
        System.out.println("---------------------------------");
        System.out.println("NÚMERO: "+this.getNumConta());
        System.out.println("NOME: "+this.getDonoConta());
        System.out.println("TIPO: "+this.getTipoConta());
        System.out.println("SALDO: "+this.getSaldoConta());
        System.out.println("STATUS: "+this.getStatusConta());
    }

    //Construtor
    public ContaBancaria() {
        this.setSaldoConta(0);
        this.setStatusConta(false);
    }

    //Getters e Setters
    public void setNumConta(int c) {
        this.numConta = c;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setTipoConta(String t) {
        this.tipoConta = t;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setDonoConta(String d) {
        this.donoConta = d;
    }

    public String getDonoConta() {
        return this.donoConta;
    }

    public void setSaldoConta(float s) {
        this.saldoConta = s;
    }

    public float getSaldoConta() {
        return this.saldoConta;
    }

    public void setStatusConta(boolean s) {
        this.statusConta = s;
    }

    public boolean getStatusConta() {
        return this.statusConta;
    }

}