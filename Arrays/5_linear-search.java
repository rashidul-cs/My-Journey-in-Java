
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int [size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Arrays: ");
        for (int i = 0; i<size; i++){
            System.out.println(numbers[i]);
        }
        System.out.print("Enter the number you want to find: ");
        int x = sc.nextInt();
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == x){
                System.out.println("x found at length: " + i);
            }
        }
    }
}
