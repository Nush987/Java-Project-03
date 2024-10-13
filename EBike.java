public class EBike implements Drivable {
    @Override
    public void drive() {
        System.out.println("EBike is driving!");
    }

    public static void line() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        line();
        EBike eb = new EBike();
        eb.drive();
        eb.stop();
        line();
    }
}