public abstract class Funcionario 
{
    protected String matricula;
    protected String nome;
    protected String cpf;
    protected float valorHora;
    protected float horasTrab;

    public Funcionario(String matricula, String nome, String cpf) 
    {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    protected abstract double calcularSalario();

    protected String reclamar()
    {
        String reclamacao = "Que dia ruim";
        return reclamacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(float horasTrab) {
        this.horasTrab = horasTrab;
    }

    
    
}