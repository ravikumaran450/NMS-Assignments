import java.util.*;

public class Naturalnumbers {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Upper Limit: ");
	int n = s.nextInt();
	System.out.println("Natural numbers from 1 to " +n +": ");
	for(int i=1; i<=n; i++){
		System.out.print(i +",");
	}
}
}