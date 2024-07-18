import java.util.*;

public class SeedOfNumber {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Number: ");
	int n = s.nextInt();
	System.out.println("Input another Number: ");
	int m = s.nextInt();
	int digits=0,sum=n;
	int temp=n;
	while(n>0){
	 n=n/10;
	digits++;
	sum=sum*digits;
	}
	if(sum==m){
	System.out.println(temp+" is a seed of " +m);
	}
	else{
	System.out.println(temp+" is not a seed of " +m);
	}
}
}