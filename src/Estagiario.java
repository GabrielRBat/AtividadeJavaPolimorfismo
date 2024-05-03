public class Estagiario extends Funcionario implements BonusSalarial
{  
    private int periodo;
    private String areaAtuacao;

    public Estagiario(int matricula, String nome, String cpf, int periodo, String areaAtuacao) 
    {
        super(matricula, nome, cpf);
        this.periodo = periodo;
        this.areaAtuacao = areaAtuacao;
    }
  
    @Override
    public double calcularBonus() 
    {
        return 0;
    }

    @Override
    protected double calcularSalario() 
    {
        double salario = valorHora * horasTrab;
        return salario;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
}
