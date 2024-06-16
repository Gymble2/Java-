package git.desafios.hub;

import java.util.Scanner;

public class chamadaRecursiva {
    public static void main(String[] args) {
        Scanner somas = new Scanner(System.in);
        int n;


        n = somas.nextInt();

        System.out.println(somatioria(n));


    }

    static  int somatioria(int num){
        if (num == 0){
            System.out.println("Valor nulo");
            return  0;
        }else{
            return  num + somatioria(num-1);
        }

    }


}
