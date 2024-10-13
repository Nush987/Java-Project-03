public class Bike extends Vehicle {
    public Bike(String name, String color, int year) {
        super(name, color, year);
    }

    @Override
    public void fuelUp() {
        System.out.println("Bike Fueled Up!");
    }

    public static void main(String[] args) {
        line();
        Bike b = new Bike("Bajaj", "Blue", 2009);
        b.fuelUp();
        b.getName();
        line();

        Vehicle Truck = new Vehicle("Leyland", "Yellow", 2006);
        Truck.fuelUp();
        Truck.getName();
        line();
    }
}