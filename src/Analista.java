public class Analista extends Funcionario implements BonusSalarial
{
    private String experiencia;
    private String areaEspecializacao;
    private int metasAtingidas;

    public Analista(int matricula, String nome, String cpf, String experiencia, String areaEspecializacao, int metasAtingidas) 
    {
        super(matricula, nome, cpf);
        this.experiencia = experiencia;
        this.areaEspecializacao = areaEspecializacao;
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
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }

    public int getMetasAtingidas() {
        return metasAtingidas;
    }

    public void setMetasAtingidas(int metasAtingidas) {
        this.metasAtingidas = metasAtingidas;
    }

    
}
