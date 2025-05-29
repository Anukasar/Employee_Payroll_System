package Container;

import Address_container.Address;

public abstract class Employee {
     private int id;
     private String name;
     private String mobno;
     private double salary;
     private Address addr;
	public Employee(int id, String name, String mobno, double salary, Address addr) {
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.salary = salary;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return "Employee [id :" + id + ", name :" + name + ", mobno : " + mobno + ", salary : " + salary + ", City : " +addr.getCity()
				+"Dist : "+addr.getDist()+ " State : "+addr.getState()+"Pincode : "+addr.getPincode()+"]";
	}
     
	
}
