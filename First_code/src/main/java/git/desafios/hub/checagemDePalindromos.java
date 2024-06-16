package git.desafios.hub;

import java.util.Scanner;

public class checagemDePalindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindromo = sc.nextLine();


        String novaPalavra = "";

        String [] letras = palindromo.split("");
        for (int i = 0; i < letras.length; i++) {
            novaPalavra = novaPalavra+ letras[i];
            
        }

        System.out.println(novaPalavra.equals(palindromo)?"TRUE":"FALSE");


    }

}
