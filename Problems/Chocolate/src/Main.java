import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (k < n &&  k < m) {
            System.out.println("NO");
        }
        else if (k > n * m) {
            System.out.println("NO");
        }
        else if (k % n == 0 || k % m == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
