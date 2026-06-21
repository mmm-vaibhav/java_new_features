package java_9.private_methods;

public class PrivateMethodDemo {

    public static void main(String[] args) {
        Java_9_Interface j9 = new Java_9_Interface() {};
        j9.generateRandom();
        System.out.println("========================");
        j9.generateRandom2();
    }
}
