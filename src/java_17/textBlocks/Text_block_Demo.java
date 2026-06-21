package java_17.textBlocks;

public class Text_block_Demo {
    public static String getString() {
        return "this is java Text block \nDemo "
                +"before Java 17 \n";
    }

    public static String getStringJava17() {
        return """
                this is java Text block Demo
                after Java 17
                A new feature added.
                """;
    }

    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println("==========================");
        System.out.println(getStringJava17());
    }

}
