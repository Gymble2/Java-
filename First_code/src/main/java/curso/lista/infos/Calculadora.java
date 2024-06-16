package curso.ninja.lista.infos;

public class Calculadora {
    public void somaArrays(int[]  soma){
        int numeros = 0;
        for(int num :soma) {
            numeros += num;

        }

        System.out.println(numeros);

    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num :numeros) {
            soma += num;

        }

        System.out.println(soma);



    }
}
