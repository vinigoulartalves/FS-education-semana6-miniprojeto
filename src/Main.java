import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("BEM VINDO!");
        menuLogin();


    }

    public static void menuLogin() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|         MENU LOGIN         |");
        System.out.println("+----------------------------+");
        System.out.println("| 1. FUNCIONÁRIO             |");
        System.out.println("| 2. ALUNO                   |");
        System.out.println("+----------------------------+");
        System.out.println("| 0. Sair                    |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                menuFuncionario();
                break;
            case 2:
                System.out.println("MENU ALUNO");
                menuAluno();
                //TODO Menu aluno
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        //entrada.close();
        menuLogin();

    }

    public static void menuFuncionario() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|      MENU FUNCIONÁRIO      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1. DIRETOR                 |");
        System.out.println("| 2. PROFESSOR               |");
        System.out.println("+----------------------------+");
        System.out.println("| 0. VOLTAR                  |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                menuDiretor();
                //TODO Menu diretor
                break;
            case 2:
                menuProfessor();
                //TODO Menu professor
                break;
            case 0:
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuFuncionario();
    }

    public static void menuDiretor() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|        MENU DIRETOR        |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR DIRETOR:     |");
        System.out.println("| 2 - DIRETOR EXISTENTE:     |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("Metodo cadastro diretor");

                Diretor novoDiretor = new Diretor();
                DadosDiretores.adicionarDiretor(novoDiretor, entrada);

                break;
            case 2:
                System.out.println("Menu de diretor");
                Diretor diretorEscolhido = DadosDiretores.buscarIdDiretor(entrada);
                System.out.println(diretorEscolhido.getNome());
                break;
            case 0:
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
    }

    public static void menuProfessor() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|        MENU PROFESSOR      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR PROFESSOR:   |");
        System.out.println("| 2 - PROFESSOR EXISTENTE:   |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("Metodo cadastro professor");

                Professor novoProfessor = new Professor();
                DadosProfessores.adicionarProfessor(novoProfessor, entrada);

                //TODO Metodo cadastro de professor
                break;
            case 2:
                System.out.println("Menu de professor");

                Professor professorEscolhido = DadosProfessores.buscarIdProfessor(entrada);
                System.out.println(professorEscolhido.getNome());


                //TODO Menu de professor
                break;
            case 0:
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
    }

    public static void menuAluno() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|          MENU ALUNO        |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR ALUNO:       |");
        System.out.println("| 2 - ALUNO EXISTENTE:       |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("Metodo cadastro aluno");

                Aluno novoAluno = new Aluno();
                DadosAlunos.adicionarAluno(novoAluno, entrada);

                //TODO Metodo cadastro de aluno
                break;
            case 2:
                System.out.println("Menu de aluno");

                Aluno alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                System.out.println("Bem Vindo " + alunoEscolhido.getNome() + "!");

                //TODO Menu de aluno
                break;
            case 0:
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
    }

    public static void menuAcoesAluno(Aluno alunoEscolhido) {

        // listar curso, adicionar curso, remover curso, também pode trancar ou ativar sua conta

        Scanner entrada = new Scanner(System.in);

        System.out.println(alunoEscolhido.getNome());
        System.out.println("1 - LISTAR CURSOS: ");
        System.out.println("2 - ADICIONAR CURSO: ");
        System.out.println("3 - REMOVER CURSO: ");
        System.out.println("4 - TRANCAR MATRICULA: ");
        System.out.println("5 - ATIVAR MATRICULA: ");
        System.out.println("0 - SAIR: ");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolha) {
            case 1:

                //TODO listar cursos
                break;
            case 2:

                //TODO add cursos
                break;
            case 3:

                //TODO remover cursos
                break;
            case 4:

                //TODO trancar matricula
                break;
            case 5:

                //TODO Menu ativar matricula
                break;
            case 0:
                //TODO Sair
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }

    }

}

