public class Diretor extends Funcionario{

    private static int idGeral = 0;
    private int idDiretor;
    private String nome;
    private int tempoTrabalho;

    public Diretor() {

    }

    public Diretor(String nome, double salario, int tempoTrabalho) {
        super(nome, salario);
        this.tempoTrabalho = tempoTrabalho;

        idGeral += 1;
        setIdDiretor(idGeral);
    }

    public int getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(int idDiretor) {
        this.idDiretor = idDiretor;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "idDiretor=" + idDiretor +
                ", nome='" + nome + '\'' +
                ", tempoTrabalho=" + tempoTrabalho +
                '}';
    }
}

