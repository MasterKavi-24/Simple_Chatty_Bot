import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n1 = number/100;
        int n2 = (number/10)%10;
        int n3 = (number%10)%10;
        System.out.println(n1+n2+n3);
    }
}