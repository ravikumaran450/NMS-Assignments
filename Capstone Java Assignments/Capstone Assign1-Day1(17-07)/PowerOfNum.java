import java.util.*;

public class PowerOfNum {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input base: ");
	int n = s.nextInt();
	System.out.println("Input exponent: ");
	int p = s.nextInt();
	int result=1;
	for(int i=1; i<=p; i++){
		result=result*n;
	}
	System.out.print(n +"Power of " + p + " is: " +result);
}
}