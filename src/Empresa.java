import java.util.ArrayList;

public class Empresa 
{
    public static ArrayList<BonusSalarial> listaFuncionarios = new ArrayList<>();
    
    public static void adicionarFuncionario(BonusSalarial funcionario)
    {
        listaFuncionarios.add(funcionario);
    }

    public static boolean removerFuncionario(BonusSalarial funcionario)
    {
        if(listaFuncionarios.contains(funcionario))
        {
            listaFuncionarios.remove(funcionario);
            return true;
        }
        return false;
    }

    public static ArrayList<BonusSalarial> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static BonusSalarial buscarFuncionario(int matricula)
    {
        for(BonusSalarial funcionario : listaFuncionarios)
        {
            if(matricula == funcionario.getMatricula())
            {
                return funcionario;
            }
        }
        return null;
    }

    public static boolean listaFuncionariosIsEmpty()
    {
        return listaFuncionarios.isEmpty();
    }
}

