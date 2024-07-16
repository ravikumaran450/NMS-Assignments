import java.util.*;


public class Program1
{
public static void main (String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter values");
float length = s.nextFloat();
float width = s.nextFloat();
float area = ( length*width) ;
System.out.println("Area of Rectangle is: "+area);
}
}