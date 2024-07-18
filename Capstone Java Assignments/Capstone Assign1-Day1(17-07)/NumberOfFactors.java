import java.util.*;

public class NumberOfFactors {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Input: ");
	int n = s.nextInt();
	System.out.print("Factors of " + n + " are:");
	for(int i=1; i<=n; i++){
		if(n%i==0){
		System.out.print(i +",");
		}
	}
	
}
}