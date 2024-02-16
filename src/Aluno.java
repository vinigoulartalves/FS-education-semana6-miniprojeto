import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    //Lista os cursos em que o aluno está matriculado
    public List<Curso> listarCursos(List<Curso> cursos) {
        List<Curso> cursosdoaluno = new ArrayList<>();
        for (Curso curso:cursos){ //percorre a lista dos cursos
            if (curso.getAlunos().contains(this)){ //procurando o aluno na lista
                cursosdoaluno.add(curso);//adicionando o curso na lista de curso desse aluno
            }
        }
        return cursosdoaluno;
    }

    //Adiciona um curso à lista de cursos
    public void adicionarCurso(Curso curso) {
        curso.adicionarAluno(this);
    }

    //Remove um curso da lista de cursos
    public void removerCurso(Curso curso) {
        curso.removerAluno(this);
    }

    //Altera o status de matrícula do aluno para trancado
    public void trancarConta() {
        if (statusMatricula == StatusMatricula.TRANCADO) {
            System.out.println("A matrícula já está trancada.");
        } else {
            statusMatricula = StatusMatricula.TRANCADO;
            System.out.println("Matrícula trancada com sucesso.");
        }
    }

    //Altera o status de matrícula do aluno para ativo
    public void ativarConta() {
        if (statusMatricula == StatusMatricula.ATIVO) {
            System.out.println("A matrícula já está ativa.");
        } else {
            statusMatricula = StatusMatricula.ATIVO;
            System.out.println("Matrícula ativada com sucesso.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idAluno == aluno.idAluno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno);
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
