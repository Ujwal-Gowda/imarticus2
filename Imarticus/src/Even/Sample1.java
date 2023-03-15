package Even;

	import java.util.Arrays;
	import java.util.List;
	import java.util.function.Predicate;


	class Emp2{
		int id;
		float salary;
		public Emp2(int id, float salary) {
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
			return "Emp [id=" + id + ", salary=" + salary + "]";
		}
		
		
	}

	public class Sample1 {

		public static void main(String[] xyz) {
			
			
			
			List<Emp2> empList = Arrays.asList(new Emp2(1,25000),new Emp2(2,35000),new Emp2(3,5000),
					new Emp2(4,12000));
			
		
			empList.stream().filter(eachEmp->eachEmp.getSalary() >= 25000).forEach(x->System.out.println(x));
			
		}

		
	}



