import java.util.*;

public class Program4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Length in cm = ");
        double cm = s.nextDouble();

        double meter = cm/100.0;
        double km = cm/100000.0;


        System.out.println("Length in meter = " + meter +" m");
        System.out.println("Length in kilometer = " + km +" km");
       
    }
}