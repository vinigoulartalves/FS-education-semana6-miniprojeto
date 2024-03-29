import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosTurmas {
    public static List<Turma> listaTurmas = new ArrayList<>();

    public static void adicionarTurma(Turma turma) {
        listaTurmas.add(turma);
    }

    public static void listarTurmas() {
        for (Turma turma : listaTurmas) {
            System.out.println("ID Turma: [" + turma.getIdTurma() + "]");
            System.out.println("Curso: " + turma.getCurso());
            System.out.println("Professor: " + turma.getCurso().getProfessor());
            System.out.println("Ano de criação: " + turma.getAnoCriacao());

            System.out.println("\nAlunos: ");
            for (Aluno aluno : turma.getCurso().getAlunos()) {
                System.out.println(" [" + aluno.getIdAluno() + "] - " + aluno.getNome());
            }
            System.out.println("----------------------");
            System.out.println();
        }
    }

    public static void listarTurmasMatriculado(Aluno alunoEscolhido) {
        boolean flag = false;
        for (Turma turma : listaTurmas) {
            for (Aluno aluno : turma.listaAlunos) {
                if (aluno.getIdAluno() == alunoEscolhido.getIdAluno()) {

                    System.out.println("ID Turma: [" + turma.getIdTurma() + "]");
                    System.out.println("Curso: " + turma.getCurso());
                    System.out.println("Professor: " + turma.getCurso().getProfessor());
                    System.out.println("Ano de criação: " + turma.getAnoCriacao());

                    System.out.println("----------------------");
                    System.out.println();
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("Aluno(a) não está matriculado(a) em nenhuma turma!");
            System.out.println("0 - VOLTAR");
            System.out.println("----------------------");
            System.out.println();
        }
    }

    public static Turma buscarIdTurmas(Scanner scanner) {
        System.out.println("Turmas Cadastradas: ");
        listarTurmas();
        System.out.println("Digite o id da turma que você quer selecionar");

        int idTurmaEscolhida = scanner.nextInt();
        scanner.nextLine();
        Turma turmaEscolhida = null;

        for (Turma turma : listaTurmas) {
            if (turma != null && turma.getIdTurma() == idTurmaEscolhida) {
                turmaEscolhida = turma;
            }
        }

        return turmaEscolhida;
    }

    public static Turma buscarIdTurmasMatriculado(Scanner scanner, Aluno alunoEscolhido) {
        System.out.println("Turmas Cadastradas: ");
        listarTurmasMatriculado(alunoEscolhido);
        System.out.println("Digite o id da turma que você quer selecionar: ");

        int idTurmaEscolhida = scanner.nextInt();
        scanner.nextLine();
        Turma turmaEscolhida = null;

        for (Turma turma : listaTurmas) {
            if (turma != null && turma.getIdTurma() == idTurmaEscolhida) {
                turmaEscolhida = turma;
            }
        }

        return turmaEscolhida;
    }

    public static void removerTurma(Scanner scanner) {
        Turma turma = buscarIdTurmas(scanner);
        listaTurmas.remove(turma);
        System.out.println("Turma " + turma.getIdTurma() + " removida!");
    }

}
