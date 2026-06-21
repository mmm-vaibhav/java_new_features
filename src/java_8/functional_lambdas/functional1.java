package java_8.functional_lambdas;

@FunctionalInterface
public interface functional1 {

    public void doMethod();
    default public void doMethodq(){};
    static public void doMethodq1(){

    }
    boolean equals(Object o);
}
