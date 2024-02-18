import java.util.ArrayList;
import java.util.List;

public class DadosTurmas {
    public static List<Turma> listaTurmas = new ArrayList<>();

    public static void adicionarTurma(Turma turma){
        listaTurmas.add(turma);
    }

    public static void listarTurmas(){
        for (Turma turma : listaTurmas) {
            System.out.println("Curso: " + turma.getCurso());
            System.out.println("Professor: " + turma.getCurso().getProfessor());
            System.out.println("Ano de criação: " + turma.getAnoCriacao());

            System.out.println("\nAlunos: ");
            for (Aluno aluno : turma.getCurso().getAlunos()) {
                System.out.println(" [" + aluno.getIdAluno() + "] - " + aluno.getNome());
            }

            System.out.println("\n");
        }
    }
}
