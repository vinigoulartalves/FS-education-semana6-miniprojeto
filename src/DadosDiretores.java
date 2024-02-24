import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosDiretores {
    public static List<Diretor> listaDiretores = new ArrayList<>();

    public static void adicionarDiretor(Diretor diretor, Scanner entrada) {

        entrada = new Scanner(System.in);

        String nome;
        double salario;
        int tempoTrabalho;
        System.out.println("Insira o nome: ");
        nome = entrada.nextLine();
        System.out.println("Insira o salário: ");
        salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Insira o tempo de trabalho (Anos): ");
        tempoTrabalho = entrada.nextInt();
        entrada.nextLine();

        Diretor novoDiretor = new Diretor(nome, salario, tempoTrabalho);

        listaDiretores.add(novoDiretor);

        System.out.println("Diretor " + novoDiretor.getNome() + " adicionado.");
    }

    public static Diretor buscarIdDiretor(Scanner scanner) {

        System.out.println("Diretores Cadastrados: ");
        listarDiretores();
        System.out.print("Digite o id do diretor que você quer selecionar: ");

        int idDiretorEscolhido = scanner.nextInt();
        scanner.nextLine();
        Diretor diretorEscolhido = null;

        for (Diretor diretor : listaDiretores) {
            if (diretor.getIdDiretor() == idDiretorEscolhido) {
                diretorEscolhido = diretor;
            }
        }


        return diretorEscolhido;
    }

    public static void listarDiretores() {
        for (Diretor diretor : listaDiretores) {
            System.out.println("[" + diretor.getIdDiretor() + "] - " + diretor.getNome());
        }
    }
}
