import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        boolean check = a<=h && h<=b;
        if (b<h) {
            System.out.println("Excess");
        }
        else if (a>h) {
            System.out.println("Deficiency");
        }
        else if (check) {
            System.out.println("Normal");
        }
    }
}