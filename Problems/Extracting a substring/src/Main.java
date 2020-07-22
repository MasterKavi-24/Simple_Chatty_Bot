import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.next();
        int start_index = scanner.nextInt();
        int end_index = scanner.nextInt();
        end_index +=1;
        String substr1 = text.substring(start_index,end_index);
        System.out.println(substr1);
    }
}
