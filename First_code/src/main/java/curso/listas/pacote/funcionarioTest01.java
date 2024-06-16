package curso.ninja.listas.pacote;

import curso.ninja.lista.infos.Funcionario;

public class funcionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario();


        funcionario.idade = 13;
        funcionario.nome = "Joaquim";

        funcionario.imprima();
        funcionario.mediaSalarial();

    }

}
