package org.example;

import java.util.function.Predicate;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {


        public static  boolean verificarElemento(Predicate<Object> target, int elemento) {
            return target.test(elemento);
        }

        public static void main (String [] args) {
            Predicate maiorQueZero = num -> (boolean) num ;


            System.out.println(verificarElemento(maiorQueZero, 5));      // true
            System.out.println(verificarElemento(maiorQueZero, 7));     // false

        }
}
