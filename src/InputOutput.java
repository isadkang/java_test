import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Get integer input
        System.out.print("Enter your age: ");
        int age = input.nextInt();
//        Get string input
        System.out.print("Enter your name: ");
        String name = input.next();

        if (age >= 25)
            System.out.println("You are Adult, Hello " + name );
        else
            System.out.println("You are Young, Hello " + name);

    }
}
