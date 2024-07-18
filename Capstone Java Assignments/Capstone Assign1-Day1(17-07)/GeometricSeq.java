import java.util.*;

public class GeometricSeq {
	public static void main(String [] agrs){
	
	Scanner s = new Scanner(System.in);
	System.out.println("Input Range: ");
	int n = s.nextInt();
	int num = 1;
        int num2 = 1;
	System.out.print(" Geometric Elements: " +num);
	for(int i=1; i<n; i++){
		num2=num2*2;
		System.out.print(","+num2);
	}
}
}