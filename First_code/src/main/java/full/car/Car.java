package curse.full.car;

public class Car {
    String model;
    String make;
    int year;

    Car(String make, String model, int Year){
        this.model = model;
        this.make = make;
        this.year = year;

    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }


    public void setYear(int year){
        this.year = year;

    }
    public void setModel(String model){

        this.model = model;

    }
    public void setMake(String make){

        this.make = make;

    }

    public void copy(Car x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());

    }




}
