import java.util.*;



class Employee {

    private int employeeId;

    private String employeeName;



    public Employee(int employeeId, String employeeName) {

        this.employeeId = employeeId;

        this.employeeName = employeeName;

    }



    public int getEmployeeId() {

        return employeeId;

    }



    public void setEmployeeId(int employeeId) {

        this.employeeId = employeeId;

    }



    public String getEmployeeName() {

        return employeeName;

    }



    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;

    }

}



class PermanentEmployee extends Employee {

    private double basicPay;

    private double hra;

    private double experience;



    public PermanentEmployee(int empId, String name, double basicPay, double hra, double experience) {

        super(empId, name);

        this.basicPay = basicPay;

        this.hra = hra;

        this.experience = experience;

    }



    public double calculateMonthlySalary() {

        double variableComponent;

        if (experience < 3) {

            variableComponent = 0;

        } else if (experience >=3 && experience <= 5) {

            variableComponent = basicPay * 0.05;

        }  else if (experience >=5 && experience < 10) {

            variableComponent = basicPay * 0.07;

        }  else {

            variableComponent = basicPay * 0.12; 

        }

        return basicPay + hra + variableComponent;

    }



    public double getBasicPay() {

        return basicPay;

    }



    public void setBasicPay(double basicPay) {

        this.basicPay = basicPay;

    }



    public double getHra() {

        return hra;

    }



    public void setHra(double hra) {

        this.hra = hra;

    }



    public double getExperience() {

        return experience;

    }



    public void setExperience(float experience) {

        this.experience = experience;

    }

}



class ContractEmployee extends Employee {

    private double wage;

    private float hoursWorked;



    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {

        super(empId, name);

        this.wage = wage;

        this.hoursWorked = hoursWorked;

    }



    public double calculateSalary() {

        return hoursWorked * wage;

    }



    public double getWage() {

        return wage;

    }



    public void setWage(double wage) {

        this.wage = wage;

    }



    public float getHoursWorked() {

        return hoursWorked;

    }



    public void setHoursWorked(float hoursWorked) {

        this.hoursWorked = hoursWorked;

    }

}



public class Program2 {

    public static void main(String[] args) {

    	Scanner s =new Scanner(System.in);

    	System.out.println("Inputs For PermanentEmployee...");

    	System.out.println("Employee id ");

    	int id =s.nextInt();

    	System.out.println("Employee name ");

    	String ename = s.next();

    	System.out.println("Employee BasicPay");

    	double basicpay = s.nextDouble();

    	System.out.println("Employee hra ");

    	double hra = s.nextDouble();

    	System.out.println("Employee Experience ");

    	double exp = s.nextDouble();

        PermanentEmployee permEmp = new PermanentEmployee(id, ename, basicpay, hra, exp);

        System.out.println("Hi " + ename +", your Salary is " + permEmp.calculateMonthlySalary());

        System.out.println();

    	System.out.println("Inputs for ContractEmployee ");

    	System.out.println("Employee id ");

    	int cid =s.nextInt();

    	System.out.println("Employee name ");

    	String cname = s.next();

    	System.out.println("Employee wage ");

    	double wage  = s.nextDouble();

    	System.out.println("Employee hours ");

    	float hours = s.nextFloat();

        ContractEmployee contEmp = new ContractEmployee(cid, cname, wage, hours);

        System.out.println("Hi " + cname +", your Salary is " + contEmp.calculateSalary());

    }

}