import java.util.*;

public class Program2 {

    public static void main(String[] args) {

        final double PI = 3.14;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter radius of the circle : ");
        int r = s.nextInt();

        int diameter = 2 * r;
        double circumference = 2 * PI * r;
        double area = PI * r * r;


        System.out.println("Diameter of circle is : " + diameter +" units");
        System.out.println("Circumference of circle is : " + circumference +" units");
        System.out.println("Area of circle is : " + area +" sq.units");
    }
}