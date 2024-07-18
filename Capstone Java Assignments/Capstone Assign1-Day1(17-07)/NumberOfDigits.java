import java.util.*;

public class NumberOfDigits {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Number: ");
	int n = s.nextInt();
	
	int digits=0;
	while(n>0){
	 n=n/10;
	digits++;
	}
	System.out.println("Number of Digits: " +digits);
}
}