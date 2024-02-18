import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosProfessores {
    public static List<Professor> listaProfessores= new ArrayList<>();

    public static void adicionarProfessor(Professor professor, Scanner entrada){

        entrada = new Scanner(System.in);

        String nome;
        double salario;
        int tempoTrabalho;
        int idade;
        System.out.println("Insira o nome: ");
        nome = entrada.nextLine();
        System.out.println("Insira o salário: ");
        salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Insira o tempo de trabalho (Anos): ");
        tempoTrabalho = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Insira a idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();

        Professor novoProfessor = new Professor(nome, salario, tempoTrabalho, idade);
        listaProfessores.add(novoProfessor);
        System.out.println("Professor " + novoProfessor.getNome() + " adicionado.");
    }

    public static Professor adicionarProfessor(Scanner entrada) {
        entrada = new Scanner(System.in);

        String nome;
        double salario;
        int tempoTrabalho;
        int idade;
        System.out.println("Insira o nome: ");
        nome = entrada.nextLine();
        System.out.println("Insira o salário: ");
        salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Insira o tempo de trabalho (Anos): ");
        tempoTrabalho = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Insira a idade: ");
        idade = entrada.nextInt();
        entrada.nextLine();

        Professor novoProfessor = new Professor(nome, salario, tempoTrabalho, idade);
        listaProfessores.add(novoProfessor);
        System.out.println("Professor " + novoProfessor.getNome() + " adicionado.");
        return novoProfessor;
    }


    public static Professor buscarIdProfessor(Scanner scanner){
        System.out.println("Professores Cadastrados: ");
        listarProfessores();
        System.out.println("Digite o id do professor que você quer selecionar");

        int idProfessorEscolhido = scanner.nextInt();
        scanner.nextLine();
        Professor professorEscolhido = null;
        while (idProfessorEscolhido <= 0 || idProfessorEscolhido >= listaProfessores.size() + 1) {
            System.out.println("ID inválido. Digite um ID válido:");
            idProfessorEscolhido = scanner.nextInt();
        }
        for(Professor professor : listaProfessores){
            if(professor.getIdProfessor() == idProfessorEscolhido){
                professorEscolhido = professor;
            }
        }

        return professorEscolhido;
    }

    public static void listarProfessores(){
        for(Professor professor : listaProfessores){
            System.out.println("[" + professor.getIdProfessor() + "] - " + professor.getNome());
        }
    }

    public static void removerProfessor(Scanner scanner){
        Professor professor = buscarIdProfessor(scanner);
        listaProfessores.remove(professor);
    }
}
