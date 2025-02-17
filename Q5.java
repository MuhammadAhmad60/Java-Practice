//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int n1 = input.nextInt();
        System.out.println("Enter the Second number ");
        int n2 = input.nextInt();

        if (n1 > n2){
            System.out.println("n1 is greater than n2");
        }
        else {
            System.out.println("n2 is greater ");
        }
    }
}
