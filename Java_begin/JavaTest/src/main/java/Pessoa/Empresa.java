package Pessoa;

public class Empresa extends Entidade implements Despesas,Receita{
    private String cnpj;
    private double pago;
    private double recebido;

    public Empresa(int id,String nome, String cnpj, double pago, double recebido){
        super(id,nome);
        this.cnpj=cnpj;
        this.pago=pago;
        this.recebido=recebido;
    }
    public String getFuncional(){
        return cnpj;
    }

    public double getPago(){
        return pago;
    }

    public double getSalario(){
        return recebido;
    }

    @Override
    public double despesas(){
        return pago;
    }

    @Override
    public double receita() {
        return recebido;
    }
}