package Even;

public class Sample {

	public Employee(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}
	import java.util.ArrayList;
	import java.util.List;

	class Employee{
		int empId;
		String name;
		float salary;
		
		public Employee(int empId, String name, float salary) {
			super();
			this.empId = empId;
			this.name = name;
			this.salary =salary;
		}
		public int getEmpId() {
			return EmpId;
		}
		public void setEmpId(int EmpId) {
			this.EmpId = EmpId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getSalary() {
			return fee;
		}
		public void setFee(float salary) {
			this.fee = fee;
		}
		
		
	}
	class Emp{
		
	}
	public class Employee{

		public static void main(String[] xyz) {
			
			List<Employee> dataList = new ArrayList<Employee>();
			
			Employee e1 = new Employee(10,"Arun",24000);
			Employee e2 = new Employee(11,"Ajay",65000);
			Employee e3 = new Employee(12,"Vijay",70000);
			
			dataList.add(e1);
			dataList.add(e2);
			dataList.add(e3);
			
			System.out.println(dataList);
			
		}

		
	}


