import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        boolean check = true;
        while (check) {
            int elem = scanner.nextInt();
            if (elem != 0) {
                count+=1;
                check = true;
            }
            else {
                check = false;
            }
        }
        System.out.println(count);
    }
}