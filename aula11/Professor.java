package aula11;

public class Professor extends Pessoa {

    //Atributos
    private String especialidade;
    private float salario;

    //Métodos
    public void receberAumento() {

        if ("Mestre".equals(this.getEspecialidade())) {
            this.setSalario(this.getSalario()+100f);
            System.out.println("Aumento no salário realizado com SUCESSO!");
            System.out.println("Novo salário: "+this.getSalario());
        }else{
            System.out.println("Aumento indisponível! Você precisa ser promovido para Mestre");
        }
    }

    //Métodos Especiais (Getters e Setters)
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
