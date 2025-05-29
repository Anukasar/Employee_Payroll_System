package Sub_Container;

import Address_container.Address;
import Container.Employee;

public class Fulltime extends Employee{
	
	private double montlysalary;

	public Fulltime(int id, String name, String mobno, double salary, Address addr, double montlysalary) {
		super(id, name, mobno, salary, addr);
		this.montlysalary = montlysalary;
	}

	@Override
	public double calculateSalary() {
		
		return montlysalary;
	}
	

}
