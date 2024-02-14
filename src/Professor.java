public class Professor extends Funcionario{
    private String nome;
    private int idade;
    private int tempoTrabalho;

    public Professor(String nome, int idade, int tempoTrabalho) {
        this.nome = nome;
        this.idade = idade;
        this.tempoTrabalho = tempoTrabalho;
    }

    public Professor(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }
}

