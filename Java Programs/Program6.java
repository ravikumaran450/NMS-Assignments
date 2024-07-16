import java.util.*;
import java.io.*;


public class Program6
{
public static void main (String args[])
{
float p,t,r;
Scanner s = new Scanner(System.in);
System.out.println("Enter Principle: ");
 p = s.nextFloat();
System.out.println("Enter time: ");
 t = s.nextFloat();
System.out.println("Enter rate: ");
 r = s.nextFloat();

float si = (p*r*t)/100 ;

System.out.println("Simple Interest = "+ si);

}
}