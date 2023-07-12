package aula08;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void apresentacao(String card) {

        System.out.println("Senhoras e Senhores!");
        System.out.println("Gostaríamos de apresentar os lutadores do " + card);
        System.out.println("");

    }

    public void marcarLuta(Lutador l1, Lutador l2) {

        this.setDesafiante(l1);
        this.setDesafiado(l2);

        if (this.getDesafiante().getCategoria().equals(this.getDesafiado().getCategoria()) && (!this.getDesafiante().getNome().equals(this.getDesafiado().getNome()))) {
            this.setAprovada(true);
        } else {
            this.setAprovada(false);
            System.out.println("Não é possível marcar a luta, por favor verifique as informações inseridas");
        }
    }

    public void lutar() {
        if (isAprovada()) {
            // Variáveis auxiliares para realizar o controle de rounds
            int lut1 = 0, lut2 = 0;

            // Apresentação inicial dos lutadores no ringue
            System.out.println("De um lado...");
            this.getDesafiante().apresentar();
            System.out.println("");
            System.out.println("E do outro lado...");
            this.getDesafiado().apresentar();

            // Laço de repetição for para gerar os resultados dos rounds automáticamente
            for (this.setRounds(1); this.getRounds() <= 4; this.setRounds(this.getRounds() + 1)) {
                int rand = 1 + (int) (Math.random() * 3);
                switch (rand) {
                    case 1:
                        lut1 = lut1 += 1;
                        System.out.println("");
                        System.out.println(this.getDesafiante().getNome() + " Venceu o " + this.getRounds() + "º round!");
                        break;
                    case 2:
                        lut2 = lut2 += 1;
                        System.out.println("");
                        System.out.println(this.getDesafiado().getNome() + " Venceu o " + this.getRounds() + "º round!");
                        break;
                    default:
                        System.out.println("");
                        System.out.println("O " + this.getRounds() + "º foi empate!");
                }
            }

            // Estrutura de decisão para verificar qual lutador venceu mais rounds e assim determinar o vencedor da partida
            if (lut1 != lut2) {
                if (lut1 > lut2) {
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    System.out.println("");
                    System.out.println("---------------------------------------");
                    System.out.println(this.getDesafiante().getNome() + " VENCEU A LUTA!");
                } else {
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    System.out.println("");
                    System.out.println("---------------------------------------");
                    System.out.println(this.getDesafiado().getNome() + " VENCEU A LUTA!");
                }
            } else {
                this.getDesafiante().empatarLuta();
                this.getDesafiado().empatarLuta();
                System.out.println("");
                System.out.println("---------------------------------------");
                System.out.println("A LUTA TERMINOU EMPATADA!");
            }

            //DEBUG PARA VERIFICAR EFETIVIDADE DA ESTRUTURA DE DECISÃO
            //System.out.println(lut1);
            //System.out.println(lut2);
            //Status pós luta para verificar se o sistema está manipulando o aproveitamento corretamente
            System.out.println("");
            this.getDesafiante().status();
            System.out.println("");
            this.getDesafiado().status();

        } else {
            System.out.println("Não haverá luta!");
        }

    }

    // Metodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
