import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = "Java";
        String word2 = "Programming";
        String word3 = "Language";
        word1 = scanner.next();
        word2 = scanner.next();
        word3 = scanner.next();
        System.out.println(word3);
        System.out.println(word2);
        System.out.println(word1);
    }
}