public class Gerente extends Funcionario implements BonusSalarial
{
    
    private int metasEquipeAtingidas;

    public Gerente(int matricula, String nome, String cpf, int metasEquipeAtingidas) 
    {
        super(matricula, nome, cpf);
        this.metasEquipeAtingidas = metasEquipeAtingidas;
    }

    @Override
    public double calcularBonus() 
    {
        double salario = valorHora * horasTrab;
        double bonus = (metasEquipeAtingidas/100) * salario;
        return bonus;
    }

    @Override
    protected double calcularSalario() 
    {
        double salario = valorHora * horasTrab;
        double total = salario + calcularBonus();
        return total;
    }

    public int getMetasEquipeAtingidas() {
        return metasEquipeAtingidas;
    }

    public void setMetasEquipeAtingidas(int metasEquipeAtingidas) {
        this.metasEquipeAtingidas = metasEquipeAtingidas;
    }
}
