import java.util.*;

public class Fibonacci {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Range: ");
	int n = s.nextInt();
	int num1 = 0;
	int num2 = 1;
        int num3;
	System.out.print("Fibonacci Series : " +num1 +"," +num2);
	for(int i=2; i<n; i++){
		num3= num1+num2;
		System.out.print("," +num3);
		num1=num2;
		num2=num3;
	}
}
}