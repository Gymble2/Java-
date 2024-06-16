package Pessoa;

public class Aluno extends  Pessoa implements Receita{
    private String ra;
    private String curso;
    private double mensalidade;

    public Aluno(int id,String nome, String cpf, String ra, String curso, double mensalidade){
        super(id,nome,cpf);
        this.ra=ra;
        this.curso=curso;
        this.mensalidade=mensalidade;
    }
    public Aluno(int id,String nome, String ra, String curso, double mensalidade){
        super(id,nome);
        this.ra=ra;
        this.curso=curso;
        this.mensalidade=mensalidade;
    }
    public String getRa(){
        return ra;
    }

    public String getCurso(){
        return curso;
    }

    public double getMensalidade(){
        return mensalidade;
    }

    @Override
    public double receita(){
        return mensalidade;
    }
}
