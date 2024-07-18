import java.util.Scanner;

class Teacher{

   private String  Tname , Subject;

   private int salary;

   Teacher(int s ,  String name ,  String sub){

       salary= s;

       Tname = name;


       Subject = sub;

   }
   public String getTname() {
  return Tname;
   }
   public void setTname(String Tname) {
  this.Tname=Tname;
   }
   public String getSubject() {
  return Subject;
   }
   public void setsub(String Subject) {
  this.Subject=Subject;
   }
   public int getSalary() {
  return salary;
   }
   public void setSalary(int salary){
  this.salary=salary;
   }

   public String toString(){

       return "Name: " + Tname +  "\n" + "Subject: " + Subject +  "\nSalary: " + salary;

   }

}

public class Program1

{

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

 System.out.print("Enter the number of teachers:");

 int n = sc.nextInt();

 Teacher[] teachers = new Teacher[n];

     for(int i = 0; i < teachers.length; i++){

         System.out.print("Enter the name of the teacher " + (i+1) + ":");

         String name = sc.next();


         System.out.print("Enter the salary for " + name + ":");

         int salary = sc.nextInt();

         System.out.print("Enter the Subject : ");

         String sub = sc.next();

         Teacher t = new Teacher(salary , name , sub);

         teachers[i] = t;

         System.out.println();

     }

 System.out.println("TEACHERS DETAILS---");

     for(int i = 0; i < teachers.length; i++){

         System.out.println(teachers[i]);

         System.out.println();

     }

}
}

