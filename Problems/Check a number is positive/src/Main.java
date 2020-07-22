import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        boolean check1 = number>0;
        if (check1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}