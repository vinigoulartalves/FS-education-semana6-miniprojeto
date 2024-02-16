import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DadosDiretores {
    public static List<Diretor> listaDiretores= new ArrayList<>();

    public static void adicionarDiretor(Diretor diretor){
        listaDiretores.add(diretor);
    }

    public static Diretor buscarIdDiretor(Scanner scanner){
        System.out.println("Digite o id do diretor que você quer selecionar");
        listarDiretores();

        int idDiretorEscolhido = scanner.nextInt();
        Diretor diretorEscolhido = null;
        for(Diretor diretor : listaDiretores){
            if(diretor.getIdDiretor() == idDiretorEscolhido){
                diretorEscolhido = diretor;
            }
        }

        return diretorEscolhido;
    }

    public static void listarDiretores(){
        for(Diretor diretor : listaDiretores){
            System.out.println("[" + diretor.getIdDiretor() + "] - " + diretor.getNome());
        }
    }
}
