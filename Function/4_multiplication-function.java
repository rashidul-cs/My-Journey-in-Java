
import java.util.Scanner;
public class Main {
    public static void Cal_Multi(int a, int b){
        int multi = a*b;
        System.out.println("Multiplication: " + multi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Cal_Multi(a, b);
    }
}
