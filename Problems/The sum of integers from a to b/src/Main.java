import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i,sum=0;
        for (i=a;i<=b;i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
