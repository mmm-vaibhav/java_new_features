package java_17.sealeadClasses;

public class Main {
    public static void main(String[] args) {
        Car car = new SportsCar();
        car.start();
        car.stop();

        System.out.println("=============================");
        Vehicle vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
    }
}
