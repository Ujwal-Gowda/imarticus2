package Even;

	import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;




	class Emp{
		public class Sample1 {

		}
		int id;
		float salary;
		public Emp1(int id, float salary) {
			super();
			this.id = id;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Emp1 [id=" + id + ", salary=" + salary + "]";
		}
		
		
	}

	public class Sample {

		public static void main(String[] xyz) {
			
			
			
			List<Emp> empList = Arrays.asList(new Emp(1,25000),new Emp(2,35000),new Emp(3,5000),
					new Emp1(4,12000));
			
		
			empList.stream().filter(eachEmp->eachEmp.getSalary() >= 25000).forEach(x->System.out.println(x));
			
		}

		
	}



