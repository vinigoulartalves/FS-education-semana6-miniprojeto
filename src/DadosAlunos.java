import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosAlunos {
    public static List<Aluno> listaAlunos = new ArrayList<>();

    public static void adicionarAluno(Aluno aluno, Scanner entrada) {

        entrada = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Insira o nome: ");
        nome = entrada.nextLine();
        System.out.println("Insira a idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();

        Aluno novoAluno = new Aluno(nome, idade);
        listaAlunos.add(novoAluno);
        System.out.println("Aluno " + novoAluno.getNome() + " adicionado.");
    }

    public static Aluno buscarIdAluno(Scanner scanner) {
        System.out.println("Alunos Cadastrados: ");
        listarAlunos();
        System.out.println("Digite o id do aluno que você quer selecionar");

        int idAlunoEscolhido = scanner.nextInt();
        scanner.nextLine();
        Aluno alunoEscolhido = null;
//        while (idAlunoEscolhido <= 0 || idAlunoEscolhido >= listaAlunos.size() + 1) {
//            System.out.println("ID inválido. Digite um ID válido:");
//            idAlunoEscolhido = scanner.nextInt();
//            scanner.nextLine();
//        }
        for (Aluno aluno : listaAlunos) {
            if (aluno.getIdAluno() == idAlunoEscolhido) {
                alunoEscolhido = aluno;
            }
        }

        return alunoEscolhido;
    }

    public static void listarAlunos() {
        for (Aluno aluno : listaAlunos) {
            System.out.println("[" + aluno.getIdAluno() + "] - " + aluno.getNome());
        }
    }

    public static void removerAluno(Scanner scanner) {
        Aluno aluno = buscarIdAluno(scanner);
        listaAlunos.remove(aluno);
    }


}
