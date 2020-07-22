import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long res = 1;
        int mult = 1;

        while (res <= number) {
            mult++;
            res *= mult;
        }

        System.out.print(mult);
    }
}