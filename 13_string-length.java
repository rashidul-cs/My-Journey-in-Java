
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = "Tony";
        String last_name = "Stark";
        String full_name = first_name + " " + last_name;
        System.out.println("Full Name: " + full_name);
        System.out.println("Length of the String: " + full_name.length());
        for (int i = 0; i<full_name.length(); i++){
            System.out.println(full_name.charAt(i));
        }
    }
}
