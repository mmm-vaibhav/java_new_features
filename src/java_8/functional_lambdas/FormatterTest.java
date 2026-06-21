package java_8.functional_lambdas;

public class FormatterTest {

    public static void main(String[] args) {

        FormatterService fs = new FormatterService();
        fs.setText("You are the creator of your destiny..");
        fs.doFormatting(new Formatter() {
            @Override
            public String format(String text) {
                return text.toUpperCase();
            }
        });

    }
}
