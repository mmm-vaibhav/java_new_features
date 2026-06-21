package java_17.sealeadClasses;

public sealed interface Vehicle permits Car, Bike {
    public void start();
    public void stop();
}
