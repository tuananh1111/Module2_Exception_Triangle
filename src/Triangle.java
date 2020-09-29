import java.util.InputMismatchException;

public class Triangle {
    public void checkTriangle(int a, int b, int c) {
        try {
            int sumAB = a + b;
            int sumAC = a + c;
            int sumBC = c + b;
            if (a <= 0 || b <= 0 || c <= 0 || c >= sumAB || b >= sumAC || c >= sumBC) {
                throw new IllegalTriangleException();
            } else System.out.println("This is a triangle ");
        } catch (IllegalTriangleException ex) {
            System.out.println("This is Not a Triangle");
        }
    }
}
