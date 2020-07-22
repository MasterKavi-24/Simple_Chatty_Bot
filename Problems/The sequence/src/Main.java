import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int max=0;
        int limit=0;
        while (limit<len) {
            int element = scanner.nextInt();
            if (element%4==0) {
                if (element>max) {
                    max = element;
                }
            }
            limit++;
        }
        System.out.println(max);
    }
}