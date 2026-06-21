package java_8.functional_lambdas;

public class LambdaTest {

    public static void main(String[] args) {
        FormatterService fl = new FormatterService();
        fl.setText("FUNCTIONAL programming");
        fl.doFormatting(text -> text.toLowerCase());
    }
}
