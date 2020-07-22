import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (scanner.hasNext()) {
            if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            n = scanner.nextInt();
        }
    }
}
