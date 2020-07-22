import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int counta = 0;
        int countb = 0;
        int countc = 0;
        int countd = 0;
        for (int i = 0, n; i < len; i++) {
            n = scanner.nextInt();
            if (n==5) {
                counta+=1;
            }
            else if (n==4) {
                countb+=1;
            }
            else if (n==3) {
                countc+=1;
            }
            else if (n==2) {
                countd+=1;
            }
        }
        System.out.print(countd + " ");
        System.out.print(countc + " ");
        System.out.print(countb + " ");
        System.out.print(counta);
    }
}