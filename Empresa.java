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
        
    
}
