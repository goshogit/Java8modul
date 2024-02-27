import java.util.Scanner;

public class Test2 {
    private static Scanner keyboard;

    public static void main(String[] args) {

        keyboard = new Scanner(System.in);
        System.out.println("Enter number");
       int a = keyboard.nextInt();

        while( a <= 0 || a > 100) {
            System.out.println("Enter number again");
        }
        System.out.println("Huuray");
    }
}
