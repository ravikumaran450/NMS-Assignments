import java.util.*;

public class SumOfEvenNumbers {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Upper Range: ");
	int n = s.nextInt();
	int m=0;
	System.out.println("Sum of Even numbers between 1 to " +n +": ");
	for(int i=1; i<=n; i++){
		if(i%2==0){
		m=m+i;
		}
	}
	System.out.print(m);
}
}