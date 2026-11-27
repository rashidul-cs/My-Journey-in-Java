
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int [] marks = new int [n];


        System.out.print("Enter the element of array: ");
        for (int i = 0; i<n; i++){
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i<n; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
