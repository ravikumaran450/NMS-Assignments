import java.util.*;

public class Factorial {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Upper Range: ");
	int n = s.nextInt();
	int fact = 1;
	for(int i=1; i<=n; i++){
		fact = fact * i;
	}
	System.out.println( n + " Factorial is: " +fact);
}
}