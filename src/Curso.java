import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {

    private String nomeCurso;
    private Professor professor; //vinculando o professor a classe Professor
    private List<Aluno> alunos = new ArrayList<>();

    private Turma turma;

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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    //Adiciona um aluno ao curso
    public void adicionarAluno(Aluno aluno, Turma turma) {
        if (alunos.contains(aluno)) {
            System.out.println("O aluno já está adicionado ao curso.");
        } else {
            alunos.add(aluno);
            turma.adicionarAluno(aluno);
            System.out.println("O aluno " + aluno + " foi adicionado ao curso.");
        }
    }

    //Remover um aluno do curso
    public void removerAluno(Aluno aluno, Turma turma) {
        if (alunos.contains(aluno)) {
            alunos.remove(aluno);
            turma.listaAlunos.remove(aluno);
            System.out.println("O aluno " + aluno + " foi removido do curso.");
        } else {
            System.out.println("O aluno já não faz parte da turma.");
        }
    }

    public Professor menuCriacaoTurma(Scanner scanner) {
        boolean finalizar = false;
        Professor professorEscolhido = null;

        while (!finalizar) {
            System.out.println("1 - ADICIONAR UM NOVO PROFESSOR");
            System.out.println("2 - ADICIONAR PROFESSOR EXISTENTE");

            int opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoEscolhida) {
                case 1:
                    professorEscolhido = DadosProfessores.adicionarProfessor(scanner);
                    finalizar = true;
                    break;
                case 2:
                    professorEscolhido = DadosProfessores.buscarIdProfessor(scanner);
                    finalizar = true;
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        }

        return professorEscolhido;
    }

    public Curso adicionarCurso(Scanner entrada, Turma turma) {
        entrada = new Scanner(System.in);


        System.out.println("Insira o nome: ");
        this.nomeCurso = entrada.nextLine();
        this.professor = this.menuCriacaoTurma(entrada);

        turma.setCurso(this);
        this.turma = turma;
        return this;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

    public void adicionarAluno(Aluno aluno) {
    }

    public void removerAluno(Aluno aluno) {
    }
}
