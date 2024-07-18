import java.util.*;

public class SumOfNatural {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Upper Limit: ");
	int n = s.nextInt();
	int m=0;
	System.out.println("Sum of Natural numbers from 1 to " +n +": ");
	for(int i=1; i<=n; i++){
		m=m+i;
	}
	System.out.print(m);
}
}