import java.util.Scanner;

//Area Of Circle Java Program
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pi = 3.14F;
        float Area;
        System.out.println("Enter the value of radius:" );
        float radius = input.nextInt();

        Area =( pi * (radius * radius)) ;

        System.out.println("The area of circle is: " + Area);
    }
}
