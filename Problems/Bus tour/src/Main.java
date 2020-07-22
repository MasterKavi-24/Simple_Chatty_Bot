import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = 0;
        int n = 0;
        int bridge = 0;
        boolean crash = false;

        if (scanner.hasNextInt()) {
            height = scanner.nextInt();
        }

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                bridge = scanner.nextInt();
            }
            if (bridge <= height) {
                i += 1;
                System.out.print("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }

        if (!crash) {
            System.out.print("Will not crash");
        }
    }
}
