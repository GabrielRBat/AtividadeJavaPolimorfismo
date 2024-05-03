public class Estagiario extends Funcionario implements BonusSalarial
{  
    private int periodo;
    private String areaAtuacao;

    public Estagiario(String matricula, String nome, String cpf, int periodo, String areaAtuacao) 
    {
        super(matricula, nome, cpf);
        this.periodo = periodo;
        this.areaAtuacao = areaAtuacao;
    }
  
    @Override
    public double calcularBonus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularBonus'");
    }
    @Override
    protected double calcularSalario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
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
