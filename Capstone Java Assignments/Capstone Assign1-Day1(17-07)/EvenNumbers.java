import java.util.*;

public class EvenNumbers {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Upper Range: ");
	int n = s.nextInt();
	System.out.println("Even numbers between 1 to " +n +": ");
	for(int i=1; i<=n; i++){
		if(i%2==0){
		System.out.print(i +" ,");
		}
	}
}
}