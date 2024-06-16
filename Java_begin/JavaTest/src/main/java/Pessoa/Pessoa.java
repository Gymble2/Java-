package Pessoa;

public abstract class Pessoa extends Entidade {

    public String cpf;

    public Pessoa(int id, String nome,String cpf){
        super(id,nome);
        this.cpf = cpf;
    }
    public Pessoa(int id, String nome){
        super(id,nome);
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(){
        this.cpf=cpf;
    }

}
