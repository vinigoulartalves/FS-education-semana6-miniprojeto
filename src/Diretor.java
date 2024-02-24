import java.util.Scanner;

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


    public static void promoverProfessor(Scanner scanner) {
        Professor professor = DadosProfessores.buscarIdProfessor(scanner);
        professor.promover();
        System.out.println("Professor " + professor.getNome() + " foi promovido a " + professor.getCargoFuncinario());
    }

    public static void criarTurma(Scanner scanner, Diretor diretor) {

        Curso curso = new Curso();
        Turma turma = new Turma();

        curso.adicionarCurso(scanner, turma);
        turma = turma.adicionarTurma(curso, scanner);

        DadosTurmas.adicionarTurma(turma);
    }

    public int getIdDiretor() {
        return idDiretor;
    }

    public void setIdDiretor(int idDiretor) {
        this.idDiretor = idDiretor;
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

