import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();       
        int k = scan.nextInt();       

        int result = factorial(n) / (factorial(n - k) * factorial(k));    
        System.out.println(result);
    }

   
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return factorial(n - 1) * n;
    }
}