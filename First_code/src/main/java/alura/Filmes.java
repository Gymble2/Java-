package alura.vitor;

public class Filmes {

        private String nome;
        private double preco;

        public String generico(String nome, double preco){

            this.nome = nome;
            this.preco = preco;

            return nome+preco;


        }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}

