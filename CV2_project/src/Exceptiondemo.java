import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int number = age.nextInt();
            
            if (number > 18) {
                System.out.println(number + " give voter id");
            } else {
                System.out.println(number + " not valid");
            }    
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number only.");
        }
    }
}
