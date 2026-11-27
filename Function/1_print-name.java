
import java.util.Scanner;
public class Main {
    public static void Print_My_Name(String name){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        Print_My_Name(name);
    }
}
