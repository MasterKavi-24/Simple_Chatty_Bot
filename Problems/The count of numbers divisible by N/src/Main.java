import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int i,count=0;
        for (i=a;i<=b;i++) {
            if (i%n==0) count+=1;
        }
        System.out.println(count);
    }
}