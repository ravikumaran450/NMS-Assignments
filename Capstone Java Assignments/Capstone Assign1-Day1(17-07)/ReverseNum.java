import java.util.*;

public class ReverseNum {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Number: ");
	int n = s.nextInt();
	int last=0;
	System.out.println("Reverse of "+ n +" :");
	while(n>0){
	 last=n%10;
	 n=n/10;
	 System.out.print(last);
	}
}
}