import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the vale of Principle: ");
        int p = input.nextInt();
        System.out.println("Enter the value of Rate: ");
        int r = input.nextInt();
        System.out.println("Enter the value of Time ");
        int t = input.nextInt();

        int SI = (p * r * t)/100;

        System.out.println("The Simple intrest is " + SI);
    }
}
