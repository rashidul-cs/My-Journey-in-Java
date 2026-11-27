
import java.util.Scanner;
public class Main {
    public static void Cal_Sum(int a, int b){
        int sum = a+b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Cal_Sum(a, b);
    }
}
