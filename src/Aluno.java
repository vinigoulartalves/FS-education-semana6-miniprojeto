public class Aluno {

    private static int idGeral = 0;
    private int idAluno;
    private StatusMatricula statusMatricula = StatusMatricula.TRANCADO;
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        idGeral += 1;
        setIdAluno(idGeral);
    }

    public Aluno() {
    }

    public static StatusMatricula[] getTodosStatusMatriculas() {
        return StatusMatricula.values();
    }

    public static StatusMatricula getStatusMatriculaPorNome(String nome) {
        try {
            return StatusMatricula.valueOf(nome);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

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

    @Override
    public String toString() {
        return "Aluno{" +
                "idAluno=" + idAluno +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
