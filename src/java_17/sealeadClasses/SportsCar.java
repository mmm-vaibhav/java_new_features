package java_17.sealeadClasses;

public final class SportsCar extends Car{

    @Override
    public void stop() {
        System.out.println("SportsCar stopped");
    }

    @Override
    public void start() {
        System.out.println("SportsCar started");
    }
}
