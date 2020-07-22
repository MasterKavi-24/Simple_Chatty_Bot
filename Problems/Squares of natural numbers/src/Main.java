import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean check = true;
        int i = 1;
        while (check) {
            int iSquare = i*i;
            if (n >= iSquare) {
                System.out.println(iSquare);
                check = true;
                i++;
            }
            else {
                check = false;
            }
        }
    }
}
