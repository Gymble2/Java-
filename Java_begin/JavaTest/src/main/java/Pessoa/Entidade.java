package Pessoa;

public class Entidade {
    private int id;
    private final String nome;

    public Entidade(int id, String nome){
        this.id=id;
        this.nome=nome;
    }
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
}
