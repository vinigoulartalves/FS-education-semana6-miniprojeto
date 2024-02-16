import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosAlunos {
    public static List<Aluno> listaAlunos= new ArrayList<>();

    public static void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
    }

    public static Aluno buscarIdAluno(Scanner scanner){
        System.out.println("Digite o id do aluno que você quer selecionar");
        listarAlunos();

        int idAlunoEscolhido = scanner.nextInt();
        Aluno alunoEscolhido = null;
        for(Aluno aluno : listaAlunos){
            if(aluno.getIdAluno() == idAlunoEscolhido){
                alunoEscolhido = aluno;
            }
        }

        return alunoEscolhido;
    }

    public static void listarAlunos(){
        for(Aluno aluno : listaAlunos){
            System.out.println("[" + aluno.getIdAluno() + "] - " + aluno.getNome());
        }
    }

    public static void removerAluno(Scanner scanner){
        Aluno aluno = buscarIdAluno(scanner);
        listaAlunos.remove(aluno);
    }



}
