import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosProfessores {
    public static List<Professor> listaProfessores= new ArrayList<>();

    public void adicionarProfessor(Professor professor){
        listaProfessores.add(professor);
    }

    public Professor buscarIdProfessor(Scanner scanner){
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

    public void removerProfessor(Scanner scanner){
        Professor professor = buscarIdProfessor(scanner);
        listaProfessores.remove(professor);
    }
}
