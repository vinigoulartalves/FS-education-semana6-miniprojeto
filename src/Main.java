import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Leo", 1000, 2);
        DadosDiretores dadosDiretores = new DadosDiretores();
        DadosDiretores.listaDiretores.add(diretor);

        Professor professor = new Professor("Vini", 1000, 3, 28);
        DadosProfessores dadosDiretor = new DadosProfessores();
        DadosProfessores.listaProfessores.add(professor);

        Curso abc1 = new Curso("abc1", professor);
        Curso abc2 = new Curso("abc2", professor);
        Curso abc3 = new Curso("abc3", professor);

        Turma turmaAbc1 = new Turma(abc1, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc1);
        Turma turmaAbc2 = new Turma(abc2, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc2);
        Turma turmaAbc3 = new Turma(abc3, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc3);

        DadosTurmas dadosTurmas = new DadosTurmas();

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
                Diretor diretorEscolhido = DadosDiretores.buscarIdDiretor(entrada);
                menuAcoesDiretor(diretorEscolhido);

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

    public static void subMenuDiretorProfessor(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("+----------------------------+");
        System.out.println("|    GERENCIAR PROFESSORES   |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - ADICIONAR              |");
        System.out.println("| 2 - REMOVER                |");
        System.out.println("| 3 - PROMOVER               |");
        System.out.println("| 4 - LISTAR                 |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");

        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("ADICONAR PROFESSOR");
                DadosProfessores.adicionarProfessor(entrada);
                break;
            case 2:
                System.out.println("REMOVER PROFESSOR");
                DadosProfessores.removerProfessor(entrada);
                break;
            case 3:
                System.out.println("PROMOVER PROFESSOR");
                Diretor.promoverProfessor(entrada);
                break;
            case 4:
                System.out.println("LISTAR PROFESSORES");
                DadosProfessores.listarProfessores();
                break;
            case 0:
                menuDiretor();
                break;

            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        subMenuDiretorProfessor(diretorEscolhido);
    }

    public static void subMenuDiretorAluno(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("GERENCIAR ALUNOS");
        System.out.println("1 - ADICIONAR À TURMA ");
        System.out.println("2 - REMOVER DA TURMA");
        System.out.println("3 - LISTAR ALUNOS");
        System.out.println("0 - VOLTAR ");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("ADICONAR ALUNO");

                Aluno alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                Turma turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().adicionarAluno(alunoEscolhido, turmaEscolhida);

                break;
            case 2:
                System.out.println("REMOVER ALUNO");

                alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().removerAluno(alunoEscolhido, turmaEscolhida);

                //TODO REMOVER ALUNO NÃO ESTÁ REMOVENDO ALUNO DA LISTA DA TURMA ESCOLHIDA. RETORNA MENSAGEM DE QUE O ALUNO FOI REMOVIDO, MAS NÃO O RETIRA DA LISTA!!


                break;
            case 3:
                System.out.println("LISTAR ALUNO");

                DadosAlunos.listarAlunos();

                break;
            case 0:
                menuAcoesDiretor(diretorEscolhido);
                break;

            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        subMenuDiretorAluno(diretorEscolhido);
    }

    public static void subMenuDiretorTurmas(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("GERENCIAR TURMAS");
        System.out.println("1 - CRIAR ");
        System.out.println("2 - REMOVER ");
        System.out.println("3 - LISTAR ");
        System.out.println("0 - VOLTAR ");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("CRIAR TURMA");

                Diretor.criarTurma(entrada, diretorEscolhido);

                break;
            case 2:
                System.out.println("REMOVER TURMA");

                DadosTurmas.removerTurma(entrada);

                //TODO AO REMOVER UMA TURMA DE ÍNDICE 1, A PRÓXIMA TURMA CRIADA, RECEBE VALOR 3 NO ÍNDICE E NÃO É POSSÍVEL REMOVER ESTA TURMA A PARTIR DO INDICE 3!!

                break;
            case 3:
                System.out.println("LISTAR TURMA");

                DadosTurmas.listarTurmas();

                break;
            case 0:

                break;

            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAcoesDiretor(diretorEscolhido);
    }

    public static void menuAcoesDiretor(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(diretorEscolhido.getNome());
        System.out.println("1 - GERENCIAR PROFESSORES ");
        System.out.println("2 - GERENCIAR ALUNOS ");
        System.out.println("3 - GERENCIAR TURMAS ");
        System.out.println("0 - SAIR ");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                System.out.println("Menu gerenciamento professores");
                subMenuDiretorProfessor(diretorEscolhido);


                //TODO Metodo gerenciamento professores
                break;
            case 2:
                System.out.println("Menu de aluno");

                subMenuDiretorAluno(diretorEscolhido);
                //TODO Menu de aluno
                break;
            case 3:
                subMenuDiretorTurmas(diretorEscolhido);
                break;
            case 0:
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
    }

    public static void menuAcoesProfessor(Aluno professorEscolhido) {

        // listar alunos, adicionar aluno, remover aluno da sua turma

        Scanner entrada = new Scanner(System.in);

        System.out.println(professorEscolhido.getNome());
        System.out.println("1 - ADICIONAR ALUNO À TURMA: ");
        System.out.println("2 - REMOVER ALUNO DA TURMA: ");
        System.out.println("3 - LISTAR ALUNOS: ");
        System.out.println("--------------------------------");
        System.out.println("0 - SAIR: ");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolha) {
            case 1:

                //TODO adiconar aluno a turma
                break;
            case 2:

                //TODO remover aluno
                break;
            case 3:

                //TODO listar alunos
                break;
            case 0:

                break;
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

