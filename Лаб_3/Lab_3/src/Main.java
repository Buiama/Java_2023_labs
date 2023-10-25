import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.nextLine();
        System.out.println("Your entered text:");
        System.out.println(text);
        System.out.println("\nIn alphabet order:");
        Arrays.stream(text.split("\\W+"))
                .map(String::toLowerCase)
                .distinct().sorted()
                .forEach(System.out::println);
    }
}
//        String s = "1 1 1 1 11 a a a ,gkgk fgk kt htruih bkklfjvdsjk  buidflkjda";
