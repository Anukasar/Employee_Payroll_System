package Sub_Container;

import Address_container.Address;
import Container.Employee;

public class PartTime extends Employee{
	private int noofhrs;
	private double hourlyRate;
	
	public PartTime(int id, String name, String mobno, double salary, Address addr, int noofhrs, double hourlyRate) {
		super(id, name, mobno, salary, addr);
		this.noofhrs = noofhrs;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		
		return hourlyRate * noofhrs;
	}
	
	
	

}
