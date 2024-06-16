package curse.full.car;

public class main {
    public static void main(String[] args) {
        Car car= new Car("Model", "Make", 1923);
        Car car2= new Car("Mod","fake",123);

        car2.copy(car);

        System.out.println(car);
        System.out.println(car2);
        System.out.println();
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();
        System.out.println(car2.getYear());
        System.out.println(car2.getModel());
        System.out.println(car2.getMake());
    }

}
