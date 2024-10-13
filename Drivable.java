public interface Drivable {

    void drive();

    default void stop() {
        System.out.println("Vehicle is stopping!");
    }
}
