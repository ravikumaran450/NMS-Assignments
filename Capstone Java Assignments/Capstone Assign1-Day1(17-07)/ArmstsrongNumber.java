import java.util.*;  
import java.lang.Math;  
public class ArmstsrongNumber{    
  
public static void  main(String args[]){     
   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");    
int n=sc.nextInt();  

int temp, digits=0, last=0, sum=0;   
temp=n;     
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{       
last = temp % 10;     
sum +=  (Math.pow(last, digits));   
temp = temp/10;   
}    
if(sum==n)  
{  
System.out.print(n+" is  an Armstrong Number");  
}  
else   
{  
System.out.print(n+ " is Not an Armstrong ");  
}  
}   
}  