import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = 0;
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            sum += n;
            if (n == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        }
    }
}