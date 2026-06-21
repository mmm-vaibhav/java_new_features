package java_8.default_static_methods;

public class DoorSensor implements IOTDevice{

    @Override
    public void connect() {
        System.out.println("Door Sensor connected..");
    }

    @Override
    public void hearthBeat(String deviceType) {
        System.out.println("In Door Sensor device type is coming:: " +deviceType);
    }

    @Override
    public void disconnect() {
        System.out.println("Door Sensor disconnected..");
    }
}

