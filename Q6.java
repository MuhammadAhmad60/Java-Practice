//Input currency in rupees and output in USD.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency in rupees: ");
        int Rs = input.nextInt();


        int usd = Rs / 278;
        System.out.println("The total amount in us dollars are:  " + usd + "$");
    }
}
