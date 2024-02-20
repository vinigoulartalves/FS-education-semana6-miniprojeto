import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosProfessores {
    public static List<Professor> listaProfessores= new ArrayList<>();

    public static void adicionarProfessor(Professor professor){
        listaProfessores.add(professor);
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
        System.out.println("Digite o id do professor que você quer selecionar");
        listarProfessores();

        int idProfEscolhido = scanner.nextInt();
        Professor professorEscolhido = null;
        for(Professor professor : listaProfessores){
            if(professor.getIdProfessor() == idProfEscolhido){
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
