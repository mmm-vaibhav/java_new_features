package java_8.default_static_methods;

public class SmartLight implements IOTDevice{
    @Override
    public void connect() {
        System.out.println("Smart Light connected..");
    }

    @Override
    public void disconnect() {
        System.out.println("Smart Light Disconnected..");
    }
}
