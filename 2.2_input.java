
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter int: ");
        int a = sc.nextInt();

        System.out.print("Enter float: ");
        float b = sc.nextFloat();

        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter string without space: ");
        String d = sc.next();

        sc.nextLine();
        
        System.out.print("Enter String: ");
        String e = sc.nextLine();

        System.out.print("Enter double: ");
        double f = sc.nextDouble();

        System.out.println("Int: " + a);
        System.out.println("Float: " + b);
        System.out.println("Char: " + c);
        System.out.println("String without space: " + d);
        System.out.println("String: " + e);
        System.out.println("Double: " + f);
    }
}
