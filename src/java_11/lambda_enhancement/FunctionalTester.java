package java_11.lambda_enhancement;

public class FunctionalTester {

    public static void doAddition(MyFunctionalInterface mf) {
        System.out.println(mf.add(10, 20));
    }


    public static void main(String[] args) {
        doAddition((a,b) -> a + b);
    }
}
