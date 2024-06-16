package curse.full;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {


        ArrayList<String> comida = new ArrayList<>();


        comida.add("pizza");
        comida.add("pizza");
        comida.add("pizza");

        comida.set(0,"jorgegordo");
        comida.remove(0);
        comida.clear();

        for (String s : comida) {
            System.out.println(s);
        }


    }




}
