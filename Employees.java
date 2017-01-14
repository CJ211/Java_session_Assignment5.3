import java.util.Scanner;
 
class Employee
{
    int age;
    double basic_salary;
    float da,hra,gross_sal
    String name, address, gender;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter Gender of the Employee:");
        gender = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter Age:");
        age = get.nextInt();
        System.out.println("Enter basic salary");
        basic_salary=sc.nextDouble();
    }
    void calc_salary()
    {
     		float da=basic_salary*15/100;
		     float hra=basic_salary*10/100;
	     	float gross_sal=basic_salary+da+hra;
     
    }
    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Address: "+gross_sal);
        
    }
}
 
class PermanentEmployees extends Employee
{
    int des;
    PermanentEmployee()
    {
        System.out.println("Enter Designation:");
        des = get.nextInt();
    }
    void display()
    {
        System.out.println("=============================="+"\n"+"Permament Employee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Designation: "+des);
    }
}
 
class TemporaryEmployees extends Employee
{
    int workinghrs, rate;
    partTimeEmployees()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
   }
 
    void display()
    {
        System.out.println("=============================="+"\n"+"Temporary Employee Details"+"\n"+"=============================="+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
    }
}
 
class Employees
{
    public static void main(String args[])
    {
        System.out.println("================================"+"\n"+"Enter Permanent Employee Details"+"\n"+"================================"+"\n");
        PermanentEmployees ob1 = new PermanentEmployees();
        TemporaryEmployees ob = new TemporaryEmployees();
        System.out.println("================================"+"\n"+"Enter Temporary Employee Details"+"\n"+"================================"+"\n");
        ob1.display();
        ob.calculatepay();
        ob.display();
    }
}
