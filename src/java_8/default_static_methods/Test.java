package java_8.default_static_methods;

public class Test {

    public static void main(String[] args) {
        IOTDevice iot = new DoorSensor();
        iot.connect();
        iot.hearthBeat("DoorSensor");
        iot.disconnect();

        System.out.println("============================");
        IOTDevice smartLight = new SmartLight();
        smartLight.connect();
        smartLight.hearthBeat("SmartLight");
        smartLight.disconnect();
    }
}
