import java.util.Scanner;

public class FluxoMenus {
    public static void parametrosInicializacao() {

        Diretor diretor = new Diretor("Leonardo Vieira", 5700, 2);
        DadosDiretores dadosDiretores = new DadosDiretores();
        DadosDiretores.listaDiretores.add(diretor);

        Professor professor = new Professor("Vinicius Alves", 4300, 3, 28);
        DadosProfessores dadosDiretor = new DadosProfessores();
        DadosProfessores.listaProfessores.add(professor);

        Curso abc1 = new Curso("Introdução à Python", professor);
        Curso abc2 = new Curso("Introdução à Java", professor);
        Curso abc3 = new Curso("Introdução à Javascript", professor);

        Turma turmaAbc1 = new Turma(abc1, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc1);
        Turma turmaAbc2 = new Turma(abc2, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc2);
        Turma turmaAbc3 = new Turma(abc3, 2024);
        DadosTurmas.listaTurmas.add(turmaAbc3);

        DadosTurmas dadosTurmas = new DadosTurmas();

        Aluno aluno1 = new Aluno("Ana Claudia", 38);
        turmaAbc1.getCurso().adicionarAlunoInicial(aluno1, turmaAbc1);
        DadosAlunos.listaAlunos.add(aluno1);
        Aluno aluno2 = new Aluno("Bruna Mainardes (PROCURA-SE)", 27);
//        turmaAbc1.getCurso().adicionarAlunoInicial(aluno2, turmaAbc1);
        aluno2.trancarMatricula();
        DadosAlunos.listaAlunos.add(aluno2);
        Aluno aluno3 = new Aluno("João Batista", 20);
        turmaAbc2.getCurso().adicionarAlunoInicial(aluno3, turmaAbc2);
        DadosAlunos.listaAlunos.add(aluno3);
        Aluno aluno4 = new Aluno("André Nascimento", 34);
        turmaAbc2.getCurso().adicionarAlunoInicial(aluno4, turmaAbc2);
        DadosAlunos.listaAlunos.add(aluno4);
        Aluno aluno5 = new Aluno("Leandro Dias", 19);
        turmaAbc3.getCurso().adicionarAlunoInicial(aluno5, turmaAbc2);
        DadosAlunos.listaAlunos.add(aluno5);
        Aluno aluno6 = new Aluno("Roberto Marinho", 22);
        turmaAbc3.getCurso().adicionarAlunoInicial(aluno6, turmaAbc2);
        DadosAlunos.listaAlunos.add(aluno6);
    }

    public static void menuLogin() {

        try {
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

        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuLogin();
    }

    public static void menuFuncionario() {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuFuncionario();
    }

    public static void menuDiretor() {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuDiretor();
    }

    public static void menuProfessor() {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuProfessor();
    }

    public static void menuAluno() {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuAluno();
    }

    public static void menuAcoesDiretor(Diretor diretorEscolhido) {
        try {

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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuAcoesDiretor(diretorEscolhido);
    }

    public static void subMenuDiretorProfessor(Diretor diretorEscolhido) {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        subMenuDiretorProfessor(diretorEscolhido);
    }

    public static void subMenuDiretorAluno(Diretor diretorEscolhido) {

        try {
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
                    turmaEscolhida = DadosTurmas.buscarIdTurmasMatriculado(entrada, alunoEscolhido);
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        subMenuDiretorAluno(diretorEscolhido);
    }

    public static void subMenuDiretorTurmas(Diretor diretorEscolhido) {

        try {
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuAcoesDiretor(diretorEscolhido);
    }


    public static void menuAcoesProfessor(Professor professorEscolhido) {
        try {

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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuAcoesProfessor(professorEscolhido);
    }

    public static void menuAcoesAluno(Aluno alunoEscolhido) {
        try {

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
                    turmaEscolhida = DadosTurmas.buscarIdTurmasMatriculado(entrada, alunoEscolhido);
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
        } catch (Exception e) {
            System.out.println("Valor inválido! Escolha uma opção válida!");
            System.out.println();
        }
        menuAcoesAluno(alunoEscolhido);
    }
}