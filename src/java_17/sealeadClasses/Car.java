package java_17.sealeadClasses;

public sealed class Car implements Vehicle permits SportsCar{

    public Car() {
        System.out.println("Car constructor");
    }

    @Override
    public void start() {
        System.out.println("Car started..");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped..");
    }
}
