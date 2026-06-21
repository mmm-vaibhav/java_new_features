package java_8.default_static_methods;

public interface IOTDevice {
    void connect();
    void disconnect();

    default void hearthBeat(String deviceType) {
        System.out.println("this device :: " + deviceType + " is active.");
    }



}
