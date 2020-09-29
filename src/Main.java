import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value of a: ");
            int a = input.nextInt();
            System.out.println("Enter the value of b: ");
            int b = input.nextInt();
            System.out.println("Enter the value of c: ");
            int c = input.nextInt();
            Triangle triangle = new Triangle();
            triangle.checkTriangle(a, b, c);
        } catch (InputMismatchException ex) {
            System.out.println("Its Not type of number");
        }
    }
}
