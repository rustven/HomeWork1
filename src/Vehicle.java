public class Vehicle {

    public String brand;
   public int year;

    public Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String  toString(){
        return this.brand + " " + this.year;
    }
    public void displayInfo(){
        System.out.println(toString());
    }
}
