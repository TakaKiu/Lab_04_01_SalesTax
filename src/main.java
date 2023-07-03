import java.util.Scanner;

class SalesTaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the purchase: ");
        double price = scanner.nextDouble();


        double salesTax = 0.05 * price;


        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: $" + salesTax);


        scanner.close();
    }
}