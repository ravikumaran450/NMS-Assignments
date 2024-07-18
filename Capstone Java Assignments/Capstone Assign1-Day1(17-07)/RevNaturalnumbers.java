import java.util.*;

public class RevNaturalnumbers {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Input : ");
	int n = s.nextInt();
	System.out.println("Natural numbers from " +n + " to 1 in reverse: ");
	for(int i=n; i>=1; i--){
		System.out.print(i +",");
	}
}
}