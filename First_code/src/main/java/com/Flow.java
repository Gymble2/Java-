package com.java.oficial;

class Demo {
    public static void main(String[] args){

        int[][] arrayOfInts = {
                {  32,   87,    3, 589 },
                {  12, 1076, 2000,   8 },
                { 622,  127,   77, 955 }
        };

            int searchfor = 12;

            int i;
            int j = 0;
            boolean foundIt = false;
    search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt){
                System.out.println("Encontrado "+ searchfor +" no index "+ i + " , " + j);
            } else{
                System.out.println(searchfor+" não encontrado");

            }


    }
}
