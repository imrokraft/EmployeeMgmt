import java.util.Scanner;

public class EmployeeMain{
	public static void main(String args[]){
		
        Scanner s=new Scanner(System.in);
		
		System.out.println("Enter no of Employees");
		int n=s.nextInt();
		Employee e;
		String nm;
		int ed,sa;
		for (int i = 0; i < n; i++) {

			System.out.println("Enter Employee ID :");
			ed=s.nextInt();
			System.out.println("Enter Name :");
			nm=s.next();
			System.out.println("Enter salary :");
			sa=s.nextInt();		 

			e=new Employee(ed,nm,sa);
			e.calculateNetPay();
			e.printEmployeeDetails();
		}
	}
}