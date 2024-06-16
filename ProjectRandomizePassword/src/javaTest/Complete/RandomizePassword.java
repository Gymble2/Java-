package javaTest.Complete;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class RandomizePassword {
    public static String passwordGenerator(){
        int max = 14;
        int min = 6;
        int minTest = 0;
        int number = (int) Math. floor(Math. random() * (max - min + 1) + min);
        StringBuilder str = new StringBuilder();

        for (int lenght = 0; lenght <= number ; lenght++) {
                    List<String> letras = Arrays.asList("l","c","n");
                    Collections.shuffle(letras);
                    String choice = letras.get((int) (Math.random() * (3 - minTest)) + minTest);

                    if (Objects.equals(choice, "l")) {
                        String leters = "abcdefghijklmopqrstuvwxyz";
                        String[] letersSeparete = leters.split("");
                        str.append(letersSeparete[(int) (Math.random() * (25 - minTest)) + minTest]);
                    }
                    if (Objects.equals(choice, "c")) {
                        String caract = "!@#&*+";
                        String [] caractSeparete = caract.split("");
                        str.append(caractSeparete[(int) (Math.random()* (6 - minTest)) + minTest]);
                    }
                    if (Objects.equals(choice, "n")) {
                        String nums = "1234567890-_";
                        String[] numsSeparete= nums.split("");
                        str.append(numsSeparete[(int) (Math.random()* (12 - minTest)) + minTest]);
            }
        }
        return str.toString();
    }
}
