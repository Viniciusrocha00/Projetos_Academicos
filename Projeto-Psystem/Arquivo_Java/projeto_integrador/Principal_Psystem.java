package projeto_integrador;

import java.util.Scanner;

public class Principal_Psystem {
    private static Scanner scanner = new Scanner(System.in);
    private static ProfessorDAO professorDAO = new ProfessorDAO();
    private static AlunoDAO alunoDAO = new AlunoDAO();
    private static DietaDAO dietaDAO = new DietaDAO();
    private static TreinoDAO treinoDAO = new TreinoDAO();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Professor");
            System.out.println("2. Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    menuProfessor();
                    break;
                case 2:
                    menuAluno();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuProfessor() {
        int opcao;
        do {
            System.out.println("\nMenu Professor:");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Consultar Professor");
            System.out.println("3. Atualizar Professor");
            System.out.println("4. Deletar Professor");
            System.out.println("5. Cadastrar Aluno");
            System.out.println("6. Consultar Aluno");
            System.out.println("7. Atualizar Aluno");
            System.out.println("8. Deletar Aluno");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    consultarProfessor();
                    break;
                case 3:
                    atualizarProfessor();
                    break;
                case 4:
                    deletarProfessor();
                    break;
                case 5:
                    cadastrarAluno();
                    break;
                case 6:
                    consultarAlunoMenu();
                    break;
                case 7:
                    atualizarAlunoMenu();
                    break;
                case 8:
                    deletarAluno();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuAluno() {
        System.out.println("\nMenu Aluno:");
        System.out.println("1. Consultar Aluno");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                consultarAlunoMenu();
                break;
            case 0:
                System.out.println("Voltando ao menu principal...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    // CRUD para Professores
    private static void cadastrarProfessor() {
        System.out.print("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do professor: ");
        String cpf = scanner.nextLine();
        Professor professor = new Professor(nome, cpf);
        if (professorDAO.cadastrarProfessor(professor)) {
            System.out.println("Professor cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar professor.");
        }
    }

    private static void consultarProfessor() {
        System.out.print("Digite o CPF do professor: ");
        String cpf = scanner.nextLine();
        Professor professor = professorDAO.buscarProfessorPorCPF(cpf);
        if (professor != null) {
            System.out.println("Dados do Professor:");
            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
        } else {
            System.out.println("Professor não encontrado.");
        }
    }

    private static void atualizarProfessor() {
        System.out.print("Digite o CPF do professor que deseja atualizar: ");
        String cpf = scanner.nextLine();
        Professor professor = professorDAO.buscarProfessorPorCPF(cpf);
        if (professor == null) {
            System.out.println("Professor não encontrado.");
            return;
        }
        System.out.print("Novo nome: ");
        professor.setNome(scanner.nextLine());
        System.out.print("Novo CPF: ");
        professor.setCpf(scanner.nextLine());
        if (professorDAO.cadastrarProfessor(professor)) {
            System.out.println("Professor atualizado com sucesso!");
        } else {
            System.out.println("Erro ao atualizar professor.");
        }
    }

    private static void deletarProfessor() {
        System.out.print("Digite o CPF do professor que deseja deletar: ");
        String cpf = scanner.nextLine();
        if (professorDAO.deletarProfessor(cpf)) {
            System.out.println("Professor deletado com sucesso!");
        } else {
            System.out.println("Erro ao deletar professor.");
        }
    }

    // CRUD para Alunos
    private static void cadastrarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF do aluno: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a altura (em cm): ");
        int altura = scanner.nextInt();
        System.out.print("Digite o peso do aluno (em kg): ");
        float peso = scanner.nextFloat();
        scanner.nextLine(); // Consumir quebra de linha

        double imc = peso / Math.pow(altura / 100.0, 2);

        System.out.print("Digite o CPF do professor responsável: ");
        String cpfProfessor = scanner.nextLine();
        Professor professor = professorDAO.buscarProfessorPorCPF(cpfProfessor);
        if (professor == null) {
            System.out.println("Professor não encontrado. Não foi possível cadastrar o aluno.");
            return;
        }

        // Criação do aluno
        Aluno aluno = new Aluno(nome, cpf, idade, altura, peso, imc, professor.getIdProfessor());
        int idAluno = alunoDAO.cadastrarAlunoComRetornoID(aluno);
        if (idAluno > 0) {
            aluno.setIdAluno(idAluno);
            System.out.println("Aluno cadastrado com sucesso!");

            // Cadastro de Dieta
            System.out.print("Digite o tipo de dieta do aluno: ");
            String tipoDieta = scanner.nextLine();
            System.out.print("Digite os alimentos recomendados na dieta: ");
            String comida = scanner.nextLine();
            Dieta dieta = new Dieta(tipoDieta, comida, idAluno);
            if (dietaDAO.cadastrarDieta(dieta)) {
                System.out.println("Dieta cadastrada com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar dieta.");
            }

            // Cadastro de Treino
            System.out.print("Digite o grupo muscular para o treino: ");
            String grupoMuscular = scanner.nextLine();
            System.out.print("Digite os exercícios recomendados para o treino: ");
            String exercicios = scanner.nextLine();
            Treino treino = new Treino(grupoMuscular, exercicios, idAluno);
            if (treinoDAO.cadastrarTreino(treino)) {
                System.out.println("Treino cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar treino.");
            }
        } else {
            System.out.println("Erro ao cadastrar aluno.");
        }
    }

    private static void consultarAlunoMenu() {
        System.out.print("Digite o CPF do aluno: ");
        String cpf = scanner.nextLine();
        Aluno aluno = alunoDAO.buscarAlunoPorCPF(cpf);
        if (aluno != null) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("IMC: " + aluno.getImc());
            System.out.println("ID do Aluno: " + aluno.getIdAluno());
            dietaDAO.consultarDieta(aluno.getIdAluno());
            treinoDAO.consultarTreino(aluno.getIdAluno());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void atualizarAlunoMenu() {
        System.out.print("Digite o CPF do aluno que deseja atualizar: ");
        String cpf = scanner.nextLine();
        Aluno aluno = alunoDAO.buscarAlunoPorCPF(cpf);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }
        System.out.print("Novo nome: ");
        aluno.setNome(scanner.nextLine());
        System.out.print("Nova idade: ");
        aluno.setIdade(scanner.nextInt());
        System.out.print("Nova altura (cm): ");
        aluno.setAltura(scanner.nextInt());
        System.out.print("Novo peso (kg): ");
        aluno.setPeso(scanner.nextFloat());
        aluno.setImc(aluno.getPeso() / Math.pow(aluno.getAltura() / 100.0, 2));
        scanner.nextLine(); // Consumir quebra de linha
        if (alunoDAO.atualizarAluno(aluno)) {
            System.out.println("Aluno atualizado com sucesso!");
        } else {
            System.out.println("Erro ao atualizar aluno.");
        }
    }

    private static void deletarAluno() {
        System.out.print("Digite o CPF do aluno que deseja excluir: ");
        String cpf = scanner.nextLine();
        Aluno aluno = alunoDAO.buscarAlunoPorCPF(cpf);
        if (aluno != null) {
            boolean sucessoDieta = dietaDAO.deletarDieta(aluno.getIdAluno());
            boolean sucessoTreino = treinoDAO.deletarTreino(aluno.getIdAluno());
            boolean sucessoAluno = alunoDAO.deletarAluno(cpf);
            if (sucessoDieta && sucessoTreino && sucessoAluno) {
                System.out.println("Aluno e suas informações foram excluídos com sucesso!");
            } else {
                System.out.println("Erro ao excluir aluno.");
            }
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
