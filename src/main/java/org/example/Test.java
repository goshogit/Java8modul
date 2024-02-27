import java.util.Scanner;

public class Test {
    private static Scanner keyboard;

    public static void main(String[] args) {
        keyboard = new Scanner(System.in);
        System.out.println("Напишете някакво число");

        int myint = keyboard.nextInt();

        for(int i = 0; i < myint; i++) {
           System.out.println(i);
        }

    }
}

