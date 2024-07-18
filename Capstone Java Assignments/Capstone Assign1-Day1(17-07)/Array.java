import java.util.*;


public class Array {
	public static void main(String [] agrs){
	Scanner s = new Scanner(System.in);
	int[] a =new int[4];
	System.out.println("Enter Array Elements: ");
	int count=0;
	for(int i=0; i<4; i++){
	a[i] = s.nextInt();
	}
	for(int i=0; i<4; i++){
	if(a[i]==9){
	count++;
	}
	}
	if(count!=0){
	System.out.println("True");
	}
	else{
		System.out.println("False");
	}
}
}