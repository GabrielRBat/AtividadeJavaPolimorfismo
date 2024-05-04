package model;
import interfaces.*;

public class Gerente extends Funcionario implements BonusSalarial
{
    
    private int metasEquipeAtingidas;

    public Gerente(int matricula, String nome, String cpf, float valorHora, float horasTrab,int metasEquipeAtingidas) 
    {
        super(matricula, nome, cpf, horasTrab, valorHora);
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

    @Override
    public String toString() 
    {
        return super.toString() + "Metas atingidas pela equipe: " + metasEquipeAtingidas;
    }
}
