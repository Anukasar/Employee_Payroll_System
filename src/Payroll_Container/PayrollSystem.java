package Payroll_Container;

import java.util.ArrayList;

import Container.Employee;

public class PayrollSystem {
	
	private ArrayList<Employee>employeelist;

	public PayrollSystem() {
		employeelist = new ArrayList<>();
	}
	
    public void Add(Employee emp)
    {
           employeelist.add(emp);
    }
    public void RemoveEmployee(int id)
    {
         Employee emptoremove = null;
         
         for(Employee emp : employeelist)
         {
        	 if(emp.getId()==id)
        	 {
        		 emptoremove = emp;
        		 break;
        	 }
         }
         if(emptoremove!=null)
         {
        	 employeelist.remove(emptoremove);
        	 System.out.println("Employee with ID " + id + " removed.");
        	 
         }else {
        	 System.out.println("Employee with ID " + id + "not found");
         }
    }
	public void Display()
	{
		for(Employee employee : employeelist){
			System.out.println(employee);
		}
	}
}
