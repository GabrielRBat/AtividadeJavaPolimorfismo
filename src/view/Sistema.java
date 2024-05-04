package view;

import javax.sound.midi.Soundbank;

import controller.Empresa;
import interfaces.BonusSalarial;
import model.Analista;
import model.Gerente;

public class Sistema {

    private static void menu() {

        System.out.println("\nCADASTRO DO HOSPITAL - MENU");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Analista");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Listar todos os pacientes");
        System.out.println("5) Listar todos os médicos");
        System.out.println("6) Listar todos os enfermeiros");
        System.out.println("7) Remover paciente");
        System.out.println("8) Remover médico");
        System.out.println("9) Remover enfermeiro");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op) 
    {

        switch (op) {
            case 1:
                cadastrarGerente();
                break;

            case 2:
                cadastrarAnalista();
               

                break;

            case 3:

                

                break;


            case 4:

                
                break;

            case 5:

                
                break;
            case 6:

              
                break;

            case 7:

               
                break;

            case 8:

                

                break;

            case 9:

                

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
        System.out.println("Gerente =>\n" + gerente.toString() + "\ncadastrado com sucesso!!");
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

        System.out.println("Anaista =>\n" + analista.toString() + "cadastrado com sucesso!!");

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