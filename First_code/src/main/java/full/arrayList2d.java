package curse.full;

import java.util.ArrayList;

public class arrayList2d {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<>();
        bakerylist.add("pasta");
        bakerylist.add("donuts");

        ArrayList<String> producelist = new ArrayList<>();
        producelist.add("tomatos");
        producelist.add("peppers");

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("soda");
        drinks.add("beer");

        groceryList.add(bakerylist);
        groceryList.add(producelist);
        groceryList.add(drinks);

        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
    }
}
