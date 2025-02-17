//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Q7 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println(fibo(n));
    }
    public static long fibo(int n){
    if (n <= 1){
        return n;
    }
    return (fibo(n-1) + fibo(n-2));
    }
}
