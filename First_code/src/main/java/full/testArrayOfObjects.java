package curse.full;

public class testArrayOfObjects {

    public static void main(String[] args) {

        //arrayOfObjects[] refrigerator = new arrayOfObjects [3];




        arrayOfObjects food1 = new arrayOfObjects("pizza");
        arrayOfObjects food2 = new arrayOfObjects("pissa");
        arrayOfObjects food3 = new arrayOfObjects("pesa");

        arrayOfObjects[] refrigerator = {food1,food2,food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.print(refrigerator[0].name);
        System.out.print(refrigerator[1].name);
        System.out.print(refrigerator[2].name);

    }


}
