import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int len = scanner.nextInt();
        int max =0;
        for (int i=0; i<len;i++) {
            int n = scanner.nextInt();
            if (n%4==0) {
                if (n>max) {
                    max = n;
                }
            }
        }
        System.out.println(max);
    }
}