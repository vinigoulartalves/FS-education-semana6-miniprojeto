import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosTurmas {
    public static List<Turma> listaTurmas = new ArrayList<>();

    public static void adicionarTurma(Turma turma){
        listaTurmas.add(turma);
    }

    public static void listarTurmas(){
        for (Turma turma : listaTurmas) {
            System.out.println("ID Turma: [" + turma.getIdTurma() + "]");
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

    public static Turma buscarIdTurmas(Scanner scanner){
        System.out.println("Turmas Cadastradas: ");
        listarTurmas();
        System.out.println("Digite o id da turma que você quer selecionar");

        int idTurmaEscolhida = scanner.nextInt();
        scanner.nextLine();
        Turma turmaEscolhida = null;
        while (idTurmaEscolhida <= 0 || idTurmaEscolhida >= listaTurmas.size() + 1) {
            System.out.println("ID inválido. Digite um ID válido:");
            idTurmaEscolhida = scanner.nextInt();
            scanner.nextLine();
        }
        for(Turma turma : listaTurmas){
            if(turma.getIdTurma() == idTurmaEscolhida){
                turmaEscolhida = turma;
            }
        }

        return turmaEscolhida;
    }

    public static void removerTurma(Scanner scanner){
        Turma turma = buscarIdTurmas(scanner);
        listaTurmas.remove(turma);
        System.out.println("Turma " + turma.getIdTurma() + " removida!");
    }

}
