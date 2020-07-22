import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        boolean cond1 = (side1+side2) > side3;
        boolean cond2 = (side2+side3) > side1;
        boolean cond3 = (side3+side1) > side2;
        if (cond1 && cond2 && cond3) System.out.println("YES");
        else {
            System.out.println ("NO");
        }
    }
}