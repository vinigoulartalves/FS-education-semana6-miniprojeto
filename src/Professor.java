import java.util.List;

public class Professor extends Funcionario {

    private static int idGeral = 0;
    private int idProfessor;
    private int idade;
    private int tempoTrabalho;

    public Professor(){}

    public Professor(String nome,  double salario, int tempoTrabalho, int idade) {
        super (nome, salario);
        this.tempoTrabalho = tempoTrabalho;
        this.idade = idade;

        idGeral += 1;
        setIdProfessor(idGeral);
    }

    public static CargoFuncinario[] getTodosStatusMatriculas() {
        return CargoFuncinario.values();
    }

    public static CargoFuncinario getStatusMatriculaPorNome(String nome) {
        try {
            return CargoFuncinario.valueOf(nome);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return super.getNome();
    }

    public void setNome(String nome) {
        super.setNome(nome);
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

    // Listar os alunos
    public void listarAlunos(List<Curso> cursos) {
        System.out.println("Alunos na turma do professor:");
        for (Curso curso : cursos) {
            System.out.println(curso); //imprime o curso
            for (Aluno aluno : curso.getAlunos())
                System.out.println(aluno); //imprime o aluno
        }
    }

    // Adicionar um aluno à turma
    public void adicionarAluno(Curso curso, Aluno aluno) {
        curso.adicionarAluno(aluno);
    }

    //Remover um aluno da turma do professor
    public void removerAluno(Curso curso, Aluno aluno) {
        curso.removerAluno(aluno);
    }

    @Override
    public String toString() {
        return "Professor{" + "nome='" + super.getNome() + '\'' + ", idade=" + idade + ", tempoTrabalho=" + tempoTrabalho + '}';
    }
}

