import java.util.*;

public class StrongNum {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Number: ");
	int n = s.nextInt();
	int last=0;
	int sum=0;
        int temp =n;
	while(n>0){
	 last=n%10;
	 int fact=1;
	for(int i=1; i <=last; i++){
		fact=fact*i;
	}
	sum=sum+fact;
	 n=n/10;
	}
	if(sum==temp){
	System.out.println(temp +" is STRONG NUMBER ");
	}
	else{
	System.out.println(temp +" is NOT STRONG NUMBER ");
	}
}
}