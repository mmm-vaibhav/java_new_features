package java_17;

import java.time.Month;
import java.time.Year;

public class SwitchEnhencement {

    public static String switchBeforeJava17(char ch){
        String str =null;
        switch (ch){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                str = "Vowel";
                break;
                default:
                    str = "Invalid";

        }
        return str;
    }

    public static String switchAfterJava17(char ch){
        String str =null;
        switch (ch){
            case 'A', 'E', 'I', 'O', 'U' -> str = "Vowel";
            default -> str = "Invalid";
        }
        return str;
    }

    public static String switchAfterJava17WithReturn(char ch){

        return switch (ch) {
            case 'A', 'E', 'I', 'O', 'U' -> "Vowel";
            default -> "Consonent";
        };
    }

    public static void main(String[] args) {
        System.out.println(switchBeforeJava17('A'));
        System.out.println("=**=".repeat(5));
        System.out.println(switchAfterJava17('h'));
        System.out.println("=**=".repeat(5));
        System.out.println(switchAfterJava17WithReturn('K'));

        System.out.println("=**=".repeat(5));
        System.out.println(getMonthDays(Month.JANUARY, 2032));
    }

    private static int getMonthDays(Month month, int year) {
        return switch (month) {
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> {
                yield Year.isLeap(year) ? 29 : 28;
            }
            default -> 31;
        };
    }
}
