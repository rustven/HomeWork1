public class Car extends Vehicle{

    public String model;

    public Car(String brand, int year, String model){
        super(brand,year);
        this.model = model;
    }
}
