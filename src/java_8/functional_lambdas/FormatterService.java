package java_8.functional_lambdas;

public class FormatterService {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public  void doFormatting(Formatter f){
        String formattedText = f.format(text);
        System.out.println(formattedText);
    }
}
