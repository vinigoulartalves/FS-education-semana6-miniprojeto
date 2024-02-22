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
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|         MENU LOGIN         |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - FUNCIONÁRIO            |");
        System.out.println("| 2 - ALUNO                  |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - SAIR                   |");
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
                menuAluno();
                break;
            case 0:
                System.exit(1);
                break;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuLogin();
    }

    public static void menuFuncionario() {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|      MENU FUNCIONÁRIO      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - DIRETOR                |");
        System.out.println("| 2 - PROFESSOR              |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                menuDiretor();
                break;
            case 2:
                menuProfessor();
                break;
            case 0:
                menuLogin();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuFuncionario();
    }

    public static void menuDiretor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|        MENU DIRETOR        |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR DIRETOR      |");
        System.out.println("| 2 - DIRETOR EXISTENTE      |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                Diretor novoDiretor = new Diretor();
                DadosDiretores.adicionarDiretor(novoDiretor, entrada);
                break;
            case 2:
                Diretor diretorEscolhido = DadosDiretores.buscarIdDiretor(entrada);
                menuAcoesDiretor(diretorEscolhido);
                break;
            case 0:
                menuFuncionario();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuDiretor();
    }

    public static void menuProfessor() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|        MENU PROFESSOR      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR PROFESSOR    |");
        System.out.println("| 2 - PROFESSOR EXISTENTE    |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                Professor novoProfessor = new Professor();
                DadosProfessores.adicionarProfessor(novoProfessor, entrada);
                break;
            case 2:
                Professor professorEscolhido = DadosProfessores.buscarIdProfessor(entrada);
                System.out.println(professorEscolhido.getNome());
                menuAcoesProfessor(professorEscolhido);
                break;
            case 0:
                menuFuncionario();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuProfessor();
    }

    public static void menuAluno() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|          MENU ALUNO        |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CADASTRAR ALUNO        |");
        System.out.println("| 2 - ALUNO EXISTENTE        |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - VOLTAR                 |");
        System.out.println("+----------------------------+");
        System.out.print("SELECIONE UMA OPÇÃO: ");

        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                Aluno novoAluno = new Aluno();
                DadosAlunos.adicionarAluno(novoAluno, entrada);
                break;
            case 2:
                Aluno alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                System.out.println("Bem Vindo " + alunoEscolhido.getNome() + "!");
                menuAcoesAluno(alunoEscolhido);
                break;
            case 0:
                menuLogin();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAluno();
    }

    public static void subMenuDiretorProfessor(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
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
                DadosProfessores.adicionarProfessor(entrada);
                break;
            case 2:
                DadosProfessores.removerProfessor(entrada);
                break;
            case 3:
                Diretor.promoverProfessor(entrada);
                break;
            case 4:
                DadosProfessores.listarProfessores();
                break;
            case 0:
                menuAcoesDiretor(diretorEscolhido);
                break;

            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        subMenuDiretorProfessor(diretorEscolhido);
    }

    public static void subMenuDiretorAluno(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|      GERENCIAR ALUNOS      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - ADICIONAR À TURMA      |");
        System.out.println("| 2 - REMOVER DA TURMA       |");
        System.out.println("| 3 - LISTAR ALUNOS          |");
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
                Aluno alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                Turma turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().adicionarAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 2:
                alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().removerAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 3:
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
        System.out.println();
        System.out.println("+----------------------------+");
        System.out.println("|      GERENCIAR TURMAS      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - CRIAR                  |");
        System.out.println("| 2 - REMOVER                |");
        System.out.println("| 3 - LISTAR                 |");
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
                Diretor.criarTurma(entrada, diretorEscolhido);
                break;
            case 2:
                DadosTurmas.removerTurma(entrada);
                break;
            case 3:
                DadosTurmas.listarTurmas();
                break;
            case 0:
                menuAcoesDiretor(diretorEscolhido);
                break;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAcoesDiretor(diretorEscolhido);
    }

    public static void menuAcoesDiretor(Diretor diretorEscolhido) {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("BEM VINDO " + diretorEscolhido.getNome().toUpperCase() + "!");
        System.out.println("+----------------------------+");
        System.out.println("|     MENU AÇÕES DIRETOR     |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - GERENCIAR PROFESSORES  |");
        System.out.println("| 2 - GERENCIAR ALUNOS       |");
        System.out.println("| 3 - GERENCIAR TURMAS       |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - SAIR                   |");
        System.out.println("+----------------------------+");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolhaMenu = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolhaMenu) {
            case 1:
                subMenuDiretorProfessor(diretorEscolhido);
                break;
            case 2:
                subMenuDiretorAluno(diretorEscolhido);
                break;
            case 3:
                subMenuDiretorTurmas(diretorEscolhido);
                break;
            case 0:
                menuLogin();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAcoesDiretor(diretorEscolhido);
    }

    public static void menuAcoesProfessor(Professor professorEscolhido) {

        // listar alunos, adicionar aluno, remover aluno da sua turma

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("BEM VINDO " + professorEscolhido.getNome().toUpperCase() + "!");
        System.out.println("+----------------------------+");
        System.out.println("|   MENU AÇÕES PROFESSOR     |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - ADICIONAR ALUNO À TURMA|");
        System.out.println("| 2 - REMOVER ALUNO DA TURMA |");
        System.out.println("| 3 - LISTAR ALUNOS          |");
        System.out.println("| 4 - LISTAR TURMAS          |");
        System.out.println("| 5 - FORMAR UM ALUNO        |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - SAIR                   |");
        System.out.println("+----------------------------+");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolha) {
            case 1:
                Aluno alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                Turma turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().adicionarAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 2:
                alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().removerAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 3:
                DadosAlunos.listarAlunos();
                break;
            case 4:
                DadosTurmas.listarTurmas();
                break;
            case 5:
                alunoEscolhido = DadosAlunos.buscarIdAluno(entrada);
                alunoEscolhido.promover();
                break;
            case 0:
                menuLogin();
                break;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAcoesProfessor(professorEscolhido);
    }

    public static void menuAcoesAluno(Aluno alunoEscolhido) {

        // listar curso, adicionar curso, remover curso, também pode trancar ou ativar sua conta

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("BEM VINDO " + alunoEscolhido.getNome().toUpperCase() + "!");
        System.out.println("+----------------------------+");
        System.out.println("|      MENU AÇÕES ALUNO      |");
        System.out.println("+----------------------------+");
        System.out.println("| 1 - LISTAR MEUS CURSOS     |");
        System.out.println("| 2 - ADICIONAR CURSO        |");
        System.out.println("| 3 - REMOVER CURSO          |");
        System.out.println("| 4 - TRANCAR MATRICULA      |");
        System.out.println("| 5 - ATIVAR MATRICULA       |");
        System.out.println("+----------------------------+");
        System.out.println("| 0 - SAIR                   |");
        System.out.println("+----------------------------+");
        System.out.println();
        System.out.print("SELECIONE UMA OPÇÃO: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        switch (escolha) {
            case 1:
                alunoEscolhido.listarCursosDoAluno();
                break;
            case 2:
                Turma turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().adicionarAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 3:
                turmaEscolhida = DadosTurmas.buscarIdTurmas(entrada);
                turmaEscolhida.getCurso().removerAluno(alunoEscolhido, turmaEscolhida);
                break;
            case 4:
                alunoEscolhido.trancarMatricula();
                break;
            case 5:
                alunoEscolhido.ativarMatricula();
                break;
            case 0:
                menuLogin();
                return;
            default:
                System.out.println("Valor inválido! Escolha uma opção válida!");
                break;
        }
        menuAcoesAluno(alunoEscolhido);
    }

}

//TODO RETORNAR LISTA DE CURSOS DO ALUNO VAZIA
//TODO REMOVER CURSOS DO ALUNO, SOMENTE OS CURSOS EM QUE ELE ESTIVER MATRICULADO
//TODO TRY CATCH E VALIDAÇÕES DE ENTRADA

