import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long fact = 1;
        int count;
        for (count = 1; count <= n; count++) {
            fact *= count;
        }
        return fact;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}