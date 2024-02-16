import java.util.ArrayList;
import java.util.List;
public class Curso {

    private String nomeCurso;
    private Professor professor; //vinculando o professor a classe Professor
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nomeCurso, Professor professor) {
        this.nomeCurso = nomeCurso;
        this.professor = professor;

    }

    public Curso() {
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    //Adiciona um aluno ao curso
    public void adicionarAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            System.out.println("O aluno já está adicionado ao curso.");
        } else {
            alunos.add(aluno);
            System.out.println("O aluno foi adicionado ao curso.");
            }
    }

    //Remover um aluno do curso
    public void removerAluno(Aluno aluno){
        if (alunos.contains(aluno)) {
            System.out.println("O aluno foi removido do curso.");
        } else {
            alunos.remove(aluno);
            System.out.println("O aluno já não faz parte da turma.");
        }
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
}
