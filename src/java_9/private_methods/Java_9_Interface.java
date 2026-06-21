package java_9.private_methods;

import java.security.SecureRandom;

public interface Java_9_Interface {
    
    default void generateRandom() {
//        SecureRandom random = new SecureRandom();
//        long l = random.nextLong(999999L);
        long result = generateRandomWithPrivate();
        System.out.println(result);
    }

    default void generateRandom2() {
//        SecureRandom random = new SecureRandom();
//        long l = random.nextLong(999999L);
        String str = "Vaibhav's prac: " +generateRandomWithPrivate();
        System.out.println(str);
    }

    private long generateRandomWithPrivate() {
        SecureRandom random = new SecureRandom();
        return random.nextLong(999999L);
    }
}
