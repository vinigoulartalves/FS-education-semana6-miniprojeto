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
            if(aluno.id == idAluno){
                alunoEscolhido = aluno;
            }
        }

        listaAlunos.remove(alunoEscolhido);
}
}