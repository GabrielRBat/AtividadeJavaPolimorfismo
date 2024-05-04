package model;
import interfaces.*;

public class Analista extends Funcionario implements BonusSalarial
{
    private String experiencia;
    private String especializacao;
    private int metasAtingidas;

    public Analista(int matricula, String nome, String cpf, float horasTrab, float valorHora ,String experiencia, String especializacao, int metasAtingidas) 
    {
        super(matricula, nome, cpf, horasTrab, valorHora);
        this.experiencia = experiencia;
        this.especializacao = especializacao;
        this.metasAtingidas = metasAtingidas;
    }
    
    @Override
    public double calcularBonus() 
    {
        double salario = valorHora * horasTrab;
        double bonus = (metasAtingidas/100) * salario;
        return bonus;
    }

    @Override
    protected double calcularSalario() 
    {
        double salario = valorHora * horasTrab;
        double salarioTotal = salario + calcularBonus();
        return salarioTotal;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getAreaEspecializacao() {
        return especializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.especializacao = areaEspecializacao;
    }

    public int getMetasAtingidas() {
        return metasAtingidas;
    }

    public void setMetasAtingidas(int metasAtingidas) {
        this.metasAtingidas = metasAtingidas;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "Nível de experiência: " + experiencia +
        "\nÁrea de especialização: " + especializacao + 
        "\nMetas atingidas: " + metasAtingidas;
    }
}
