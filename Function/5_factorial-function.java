
import java.util.Scanner;
public class Main {
    public static void Factorial(int n){
        int facto = 1;
        if (n < 0){
            System.out.println("Invalid Number");
        }
        for (int i = n; i>=1; i--){
            facto *= i;
        }
        System.out.println("Factorial: " + facto);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Factorial(n);
    }
}
