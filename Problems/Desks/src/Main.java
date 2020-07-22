import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();
        int group1_bench = (group1%2+group1)/2;
        int group2_bench = (group2%2+group2)/2;
        int group3_bench = (group3%2+group3)/2;
        System.out.println((group1_bench)+(group2_bench)+(group3_bench));
    }
}