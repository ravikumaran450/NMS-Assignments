import java.util.*;


public class Program3
{
public static void main (String args[])
{
Scanner s = new Scanner(System.in);
System.out.println("Enter values");
float base = s.nextFloat();
float height = s.nextFloat();
float area = ( base*height)/2 ;

System.out.println("Area of Triangle = "+area +" sq.units");

System.out.println("Enter celsius value");
float celsius = s.nextFloat();
float fahrenheit = ( celsius * 9/5 ) + 32 ;

 System.out.println("Temp to Fahrenheit : "+ fahrenheit);
}
}