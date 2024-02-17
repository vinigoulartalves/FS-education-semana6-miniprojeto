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

    public static void addProfEmDados(Scanner scanner){
        Professor professor = DadosProfessores.buscarIdProfessor(scanner);
        DadosProfessores.adicionarProfessor(professor);
    }

    public static void removerProfEmDados(Scanner scanner){
        Professor professor = DadosProfessores.buscarIdProfessor(scanner);
        DadosProfessores.removerProfessor(scanner);
    }

    public static void addAlunoEmDados(Scanner scanner){
        Aluno aluno = DadosAlunos.buscarIdAluno(scanner);
        DadosAlunos.adicionarAluno(aluno);
    }

    public static void removerAlunoEmDados(Scanner scanner){
        Aluno aluno = DadosAlunos.buscarIdAluno(scanner);
        DadosAlunos.removerAluno(scanner);
    }

    public static void listarProfessores(){
        DadosProfessores.listarProfessores();
    }

    public static void listarAlunos(){
        DadosAlunos.listarAlunos();
    }

    public static void promoverProfessor(Scanner scanner){
        Professor professor = DadosProfessores.buscarIdProfessor(scanner);
        professor.promover();
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

