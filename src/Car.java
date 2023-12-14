public class Car extends Vehicle{

    public String model;

    public Car(String brand, int year, String model){
        super(brand,year);
        this.model = model;
    }
    public String toSting(){
       return  super.toString() + " " + this.model;
    }
    @Override
    public void displayInfo(){
        System.out.println(toSting());
    }
}
