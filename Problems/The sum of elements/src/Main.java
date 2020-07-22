import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        while(scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            else if (number !=0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}