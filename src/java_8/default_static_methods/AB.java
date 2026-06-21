package java_8.default_static_methods;

public class AB implements A, B{

    @Override
    public void m1() {
        A.super.m1();
    }
}
