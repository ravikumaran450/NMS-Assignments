import java.util.*;

public class LuckyNumber {

public static void main(String[] args) {
            
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input a number: ");
    int number = scanner.nextInt();
    
    int count = 0;
    while(number!=0) {
        number/=10;
        ++count;
    }
    
    int[] array = new int[count];
    int sum = 0;
    
    for (int i=0; i<count; i++) {
        array[i] = scanner.nextInt();
    }

    for (int i=0; i<count; i++) {
        if(array[i]%2==0) {
            sum+=(array[i]*array[i]);
        }
        else {
            continue;
        }
    }
    
    if (sum%9==0) {
        System.out.println("The number: " +number+ "is a Lucky number");
    }
    else {
        System.out.println("The number: " +number+" is Not a Lucky number");
    }
}
}