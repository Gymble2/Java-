package com.java.oficial;

class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");


        }
        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
    }
}

/*
            Pesquisar um array por um valor específico para obter o índice no qual ele está colocado (o método binarySearch()).

            Comparar dois arrays para determinar se eles são iguais ou não (o método equals()).

            Preencher um array para colocar um valor específico em cada índice (o método fill()).

            Classificando uma matriz em ordem crescente. Isso pode ser feito sequencialmente, usando o método sort(), ou simultaneamente, usando o método parallelSort() introduzido no Java SE 8. A classificação paralela de grandes arrays em sistemas multiprocessadores é mais rápida do que a classificação sequencial de arrays.

            Criando um stream que usa um array como fonte (o método stream()). Por exemplo, a instrução a seguir imprime o conteúdo do array copyTo da mesma maneira que no exemplo anterior:
 */