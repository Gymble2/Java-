//br.com.brastemp.logica

package com.primeiro.codico.basico;//pacote

import java.util.ArrayList;

public class EstruturaDeDecisao {
    public static void main(String[] args) {
        ArrayList<String> palavrasList= new ArrayList<>();

        palavrasList.add("Sexo");
        palavrasList.add("Com");
        palavrasList.add("Você");
        palavrasList.add("Por favor");

        for (int i=0; i<palavrasList.size(); i++){
            System.out.println(palavrasList.get(i));
        }





    }
}


/*String frase = "Quarta-feira";
        //integer é  pra numero
        //String é pra strings


            if (frase.contains("Segunda-feira")) {
                if(frase.contains("17:15")) {
                    System.out.println("Pelo menos passou segunda");}
                else{
                    System.out.println("Dia de tristeza");

                }

            }else if (frase.contains("Sexta-feira")
                    ||
                    frase.contains("Sábado")
                    ||
                    frase.contains("Domingo")

            ) {System.out.println("é mais um dia da semana");
            }else{
                System.out.println("é um dia");
            }

            if (frase.startsWith("Q")) {
            System.out.println("Inicia com q");
        }
        }

         ArrayList<String> palavrasList= new ArrayList<>();

        palavrasList.add("Sexo");
        palavrasList.add("Com");
        palavrasList.add("Você");
        palavrasList.add("Por favor");

        for (String palavra: palavrasList){
            System.out.println(palavra);
        }

        palavrasList.forEach(palavra -> System.out.println(palavra));



        */


