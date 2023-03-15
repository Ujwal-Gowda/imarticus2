package Even;

import java.util.ArrayList;
import java.util.List;

public class Employee1 {
	int empid;
	String name;
	double salary;
	public Employee1(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	class Emp{
		
	}
	public class Sample3{

		public static void main(String[] xyz) {
			
			List<Employee> dataList = new ArrayList<Employee>();
			
			Employee e1 = new Employee(10,"Arun",24000.0);
			Employee e2 = new Employee(11,"Ajay",65000.0);
			Employee e3 = new Employee(12,"Vijay",70000.0);
			
			dataList.add(e1);
			dataList.add(e2);
			dataList.add(e3);
			
			System.out.println(dataList);
			
	}


