public class Diretor extends Funcionario{

    private int tempoTrabalho;

    public Diretor() {

    }

    public Diretor(String nome, double salario, int tempoTrabalho) {
        super(nome, salario);
        this.tempoTrabalho = tempoTrabalho;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

}

