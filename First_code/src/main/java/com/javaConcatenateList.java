package com.java.oficial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class javaConcatenateList {



        public static List<Integer> main(Integer[][] args) {


            Integer[][] a  = args;

            System.out.println(Arrays.deepToString(a));

            if (a.length < 1) {
                System.out.println("O valor dos argumentos utilizados foram " + args.length);
                throw new UnsupportedOperationException("É necessario ter 2 ou mais argumentos");
            }

            List<Integer> firstList = Stream.of(a[0])
                    .toList();

            List<Integer> secondList = Stream.of(a[1])
                    .toList();

                 return firstList;

        }

        public static List<Integer> extractCommonElements(List<Integer> firstList, List<Integer> secondList) {
             Set<Integer> intersection = new HashSet<Integer>(firstList);

             intersection.retainAll(secondList);
             if (firstList.get(0).equals(secondList.get(0))) {
                 intersection.add(firstList.get(0));
             }

             if (firstList.get(firstList.size() - 1).equals(secondList.get(secondList.size() - 1))) {
                 intersection.add(firstList.get(firstList.size() - 1));
             }

             return intersection.stream().toList();
        }


        Integer [] [] valor = {{15,16},{36,12}};
        Integer [] valor2 = {valor[0][2]};


        List<Integer> a = main(valor);

        List<Integer> b = extractCommonElements(a, List.of(valor2));


}











/*     .stream (corrente de informações)
       .add(adiciona a uma lisa
       .get(pega um valoor de uma stream)
       .tolist() = adiciona a corrente de informação a lista
       .retainAll (retorna todos os valores iguais

 */
