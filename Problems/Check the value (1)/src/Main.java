import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        boolean result = n<10 && n>0 ;
        System.out.println(result);
    }
}