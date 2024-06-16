package Pessoa;

public class Professor extends  Pessoa implements Despesas{
    private int funcional;
    private String disciplina;
    private double salario;

    public Professor(int id,String nome, String cpf, int funcional, String disciplina, double salario){
        super(id,nome,cpf);
        this.funcional=funcional;
        this.disciplina=disciplina;
        this.salario=salario;
    }
    public Professor(int id,String nome, int funcional, String disciplina, double salario){
        super(id,nome);
        this.funcional=funcional;
        this.disciplina=disciplina;
        this.salario=salario;
    }
    public int getFuncional(){
        return funcional;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public double getSalario(){
        return salario;
    }
    @Override
    public double despesas(){
        return salario;
    }
}
