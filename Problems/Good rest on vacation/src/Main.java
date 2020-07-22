import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int costOfOneNightInAHotel = scanner.nextInt();
        totalFoodCostPerDay = totalFoodCostPerDay * days;
        oneWayFlightCost = oneWayFlightCost * 2;
        costOfOneNightInAHotel = costOfOneNightInAHotel * (days - 1);
        System.out.println(totalFoodCostPerDay + oneWayFlightCost + costOfOneNightInAHotel);
    }
}