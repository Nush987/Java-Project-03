public class Vehicle {
    String name;
    String color;
    int year;

    public Vehicle(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void fuelUp() {
        System.out.println("Fueled Up!");
    }

    public void getName() {
        System.out.println(this.name);
    }

    public static void line() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        line();
        Vehicle v = new Vehicle("Car", "Red", 2020);
        v.fuelUp();
        v.getName();
        line();
    }
}