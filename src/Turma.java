import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {
    public List<Aluno> listaAlunos = new ArrayList<>();
    private int anoCriacao;
    private Curso curso;

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Turma(Curso curso, int anoCriacao){
        this.curso = curso;
        this.anoCriacao = anoCriacao;
    }

    public void listarAlunos(){
        for(Aluno aluno : listaAlunos){
            System.out.println("Nome: " + aluno);
            System.out.println("Id: " + aluno + "\n");
        }
    }

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public void removerAluno(Scanner scanner){
        System.out.println("Digite o id do aluno que você quer remover");
        listarAlunos();

        int idAluno = scanner.nextInt();
        Aluno alunoEscolhido = null;

        for(Aluno aluno : listaAlunos){
            if(aluno.getIdAluno() == idAluno){
                alunoEscolhido = aluno;
            }
        }

        listaAlunos.remove(alunoEscolhido);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "listaAlunos=" + listaAlunos +
                ", anoCriacao=" + anoCriacao +
                ", curso=" + curso +
                '}';
    }
}