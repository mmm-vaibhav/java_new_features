package java_17.sealeadClasses;

public non-sealed class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }
}
