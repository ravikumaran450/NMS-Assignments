import java.util.*;

public class Program5{
	public static void main(String[] args) {
	 
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a = s.nextInt();	
	int b = s.nextInt();
	int temp;

	System.out.println("First number before swapping :" + a);
	System.out.println("Second number before swapping :" + b);

	temp=a;
	a=b;
	b=temp;
	
	System.out.println("First number after swapping :" + a);
	System.out.println("Second number after swapping :" + b);
}
}