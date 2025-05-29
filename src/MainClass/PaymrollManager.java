package MainClass;

import Address_container.Address;
import Container.Employee;
import Payroll_Container.PayrollSystem;
import Sub_Container.Fulltime;
import Sub_Container.PartTime;

public class PaymrollManager {

	public static void main(String[] args) {
		PayrollSystem payrollsystem = new PayrollSystem();
		Address addr = new Address("Moshi","Pune","Maharashtra",412105);
		
		Fulltime fulltime = new Fulltime(101,"Anuja","9067826363",56000,addr,60000);
		
		PartTime parttime = new PartTime(103,"Manisha","9067363310",60000,addr,40,50);

		payrollsystem.Add(parttime);
		payrollsystem.Add(fulltime);
		
		System.out.println("Initial Employee details");
		payrollsystem.Display();
		
		 System.out.println("Removing employee with ID 103...");
	     payrollsystem.RemoveEmployee(103);
		
		System.out.println("Remaining Employees Details..");
		payrollsystem.Display();
	}

}
