package Even;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class Empl{
	int id;
	String designation;

	public Empl(int id, String deignation) {
		super();
		this.id=id;
		this.designation=deignation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Empl [id=" + id + ", designation=" + designation + "]";
	}
	}

public class Dept {
	


	public static void main(String [] xyz, Collection<Empl> empList) {
		List<Empl>emplList=Arrays.asList(new Empl( 10, "Enginner"), new Empl(20, "HR"), new Empl(21, "HR"),
			new Empl(22, "Developer"));
		empList.stream().filter(eachEmp->(eachEmp.getDesignation().equalsIgnoreCase("hr"))
				.forEach(x->System.out.println(x));

	}
}

