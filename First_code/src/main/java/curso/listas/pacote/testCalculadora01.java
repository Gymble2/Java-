package curso.ninja.listas.pacote;

import curso.ninja.lista.infos.Calculadora;

public class testCalculadora01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int auxArray [] = {1,2,3,4,5};

        calculadora.somaArrays(auxArray) ;
        calculadora.somaVarArgs(1,2,3,4,5);


    }


}
