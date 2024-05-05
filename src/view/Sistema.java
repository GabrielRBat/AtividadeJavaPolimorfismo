package view;

import controller.Empresa;
import interfaces.BonusSalarial;
import model.Analista;
import model.Estagiario;
import model.Gerente;

public class Sistema {

    private static void menu() {

        System.out.println("\nCADASTRO DO HOSPITAL - MENU");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Analista");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Listar todos os funcionários");
        System.out.println("5) Listar todos os gerentes");
        System.out.println("6) Listar todos os analistas");
        System.out.println("7) Listar todos os estagiários");
        System.out.println("8) Remover funcionário");
        System.out.println("9) Buscar funcionário");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op) 
    {

        switch (op) 
        {
            case 1:
                cadastrarGerente();
                break;
            case 2:
                cadastrarAnalista();
                break;
            case 3:
                cadastrarEstagiario();
                break;
            case 4:
                listarFuncionarios();
                break;
            case 5:
                listarGerentes();
                break;
            case 6:
                listarAnalistas();
                break;

            case 7:
                listarEstagiarios();
                break;

            case 8:
                removerFuncionario();
                break;

            case 9:
                buscarFuncionario();
                break;
            case 0:
                System.out.println("\nSistema encerrou.");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();

    }

    private static void cadastrarGerente()
    {
        System.out.println("Digite o nome do gerente: ");
        String nome = Console.lerString();

        System.out.println("Digite o CPF do gerente: ");
        String cpf = Console.lerString();

        System.out.println("Digite a matrícula do gerente: ");
        int matricula = Console.lerInt();

        System.out.println("Digite as horas trabalhadas: ");
        float horasTrab = Console.lerFloat();

        System.out.println("Digite o valor hora trabalhada: ");
        float valorHora = Console.lerFloat();

        System.out.println("Digite quantas metas foram atingidas pela equipe do gerente: ");
        int metasEquipeAtingidas = Console.lerInt();

        BonusSalarial gerente = new Gerente(matricula, nome, cpf, valorHora, horasTrab, metasEquipeAtingidas);
        
        Empresa.adicionarFuncionario(gerente);
        System.out.println("\nGerente =>\n" + gerente.toString() + "\ncadastrado com sucesso!!");
    }

    private static void cadastrarAnalista()
    {
        System.out.println("Digite o nome do analista: ");
        String nome = Console.lerString();

        System.out.println("Digite o CPF do analista: ");
        String cpf = Console.lerString();

        System.out.println("Digite a matrícula do analista: ");
        int matricula = Console.lerInt();

        System.out.println("Digite as horas trabalhadas: ");
        float horasTrab = Console.lerFloat();

        System.out.println("Digite o valor hora trabalhada: ");
        float valorHora = Console.lerFloat();

        //experiencia areaEspecializacao metasAtingidas
        System.out.println("Digite o nível de experiência do analista: ");
        String experiencia = Console.lerString();

        System.out.println("Digite a especialização do analista: ");
        String especializacao = Console.lerString();

        System.out.println("Digite quantas metas foram atingidas pelo analista: ");
        int metasAtingidas = Console.lerInt();

        BonusSalarial analista = new Analista(matricula, nome, cpf, horasTrab, valorHora, experiencia, especializacao, metasAtingidas);
        Empresa.adicionarFuncionario(analista);

        System.out.println("\nAnaista =>\n" + analista.toString() + "\ncadastrado com sucesso!!");

    }

    private static void cadastrarEstagiario()
    {
        System.out.println("Digite o nome do estagiário: ");
        String nome = Console.lerString();

        System.out.println("Digite o CPF do estagiário: ");
        String cpf = Console.lerString();

        System.out.println("Digite a matrícula do estagiário: ");
        int matricula = Console.lerInt();

        System.out.println("Digite as horas trabalhadas: ");
        float horasTrab = Console.lerFloat();

        System.out.println("Digite o valor hora trabalhada: ");
        float valorHora = Console.lerFloat();

        System.out.println("Digite o período do estagiário: ");
        int periodo = Console.lerInt();

        System.out.println("Digite a área de atuação: ");
        String areaAtuacao = Console.lerString();

        BonusSalarial estagiario = new Estagiario(matricula, nome, cpf, horasTrab, valorHora, periodo, areaAtuacao);
        Empresa.adicionarFuncionario(estagiario);

        System.out.println("\nEstagiário =>\n" + estagiario + "\ncadastrado com sucesso!!");
    }

    private static void listarFuncionarios()
    {
        if(!Empresa.listaFuncionariosIsEmpty())
        {
            System.out.println("\nFuncionários =>\n");
            for(BonusSalarial funcionario : Empresa.getListaFuncionarios())
            {
                System.out.println(funcionario.toString() + "\n");
            }
        }

        else
        {
            System.out.println("Não há nenhum funconário na lista.");
        }
    }

    private static void listarGerentes()
    {
        boolean gerenteFlag = false;

        if(!Empresa.listaFuncionariosIsEmpty())
        {
            for(BonusSalarial gerente : Empresa.getListaFuncionarios())
            {
                if(gerente instanceof Gerente)
                {
                    System.out.println("\nGerentes =>\n" + gerente.toString() + "\n");
                    gerenteFlag = true;
                }
            }

            if(!gerenteFlag)
            {
                System.out.println("Nenhum gerente foi encontrado.");
            }
        }
        else
        {
            System.out.println("Não há nenhum funcionário na lista.");
        }
    }

    private static void listarAnalistas()
    {
        boolean analistaFlag = false;

        if(!Empresa.listaFuncionariosIsEmpty())
        {
            for(BonusSalarial gerente : Empresa.getListaFuncionarios())
            {
                if(gerente instanceof Analista)
                {
                    System.out.println("\nAnalistas =>\n" + gerente.toString() + "\n");
                    analistaFlag = true;
                }
            }

            if(!analistaFlag)
            {
                System.out.println("Nenhum analista foi encontrado.");
            }
        }
        else
        {
            System.out.println("Não há nenhum funcionário na lista.");
        }
    }

    private static void listarEstagiarios()
    {
        if(!Empresa.listaFuncionariosIsEmpty())
        {
            boolean flagEstagiario = false;

            for(BonusSalarial gerente : Empresa.getListaFuncionarios())
            {
                if(gerente instanceof Estagiario)
                {
                    System.out.println("\nEstagiários =>\n" + gerente.toString() + "\n");
                    flagEstagiario = true;
                }
            }

            if(!flagEstagiario)
            {
                System.out.println("Nenhum estagiário foi encontrado.");
            }
        }
        else
        {
            System.out.println("Não há nenhum funcionário na lista.");
        }
    }

    private static void removerFuncionario()
    {
        System.out.println("Digite a matrícula do funcionário que deseja remover.");
        int matricula = Console.lerInt();

        if(Empresa.removerFuncionario(matricula))
        {
            System.out.println("Funcionário removido com sucesso!");
        }
        else
        {
            System.out.println("Nenhum funcionário foi encontrado com essa matrícula.");
        }
    }

    private static void buscarFuncionario()
    {
        System.out.println("Digite a matrícula do funcionário que deseja buscar: ");
        int matricula = Console.lerInt();

        BonusSalarial funcionario = Empresa.buscarFuncionario(matricula);
        if(funcionario == null)
        {
            System.out.println("Funcionário não encontrado!");
            return;
        }
        System.out.println("\nFuncionário =>\n" + funcionario + "\nencontrado!");
    }

    public static void executar() {

        int opcao;

        do {

            menu();
            opcao = Console.lerInt();
            verificarOpcao(opcao);

        } while (opcao != 0);

    }

}