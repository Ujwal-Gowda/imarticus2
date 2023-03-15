package Even;

abstract class Employee {
	
	public abstract String getType();
	public abstract String getSalary();
	public abstract String getCompany();
	
	@Override
	public String toString(){
		return "type= "+this.getType()+", salary="+this.getSalary()+", company="+this.getCompany();
	}
}
 
 class  Contract extends Employee {

		private String type;
		private String salary;
		private String company;
		
		public Contract(String type, String salary, String company){
			this.type=type;
			this.salary=salary;
			this.company=company;
		}

		@Override
		public String getType() {
			
			return this.type;
		}

		@Override
		public String getSalary() {
			
			return this.salary;
		}

	
		@Override
		public String getCompany() {
			
			return this.company;
		}

}
 
 class Regular extends Employee {


		private String type;
		private String salary;
		private String company;
		
		public Regular(String type, String salary, String company){
			this.type=type;
			this.salary=salary;
			this.company=company;
		}

		@Override
		public String getType() {
			
			return this.type;
		}

		@Override
		public String getSalary() {
			
			return this.salary;
		}

	
		@Override
		public String getCompany() {
			
			return this.company;
		}
	}
 class EmployeeFactory {

		public static Employee getEmployee (String type, String salary, String company){
			if("Contract".equalsIgnoreCase(type)) return new Contract(type, salary, company);
			else if("Regular".equalsIgnoreCase(type)) return new Regular(type, salary, company);
			
			return null;
		}
	}
 public class Factory{

	public static void main(String[] args) {
		
		Employee c1 = EmployeeFactory.getEmployee("pc","2 GB","500 GB");
		Employee r1 = EmployeeFactory.getEmployee("server","16 GB","1 TB");
		System.out.println("Factory PC Config::"+c1);
		System.out.println("Factory Server Config::"+r1);
	}
	
	
 }