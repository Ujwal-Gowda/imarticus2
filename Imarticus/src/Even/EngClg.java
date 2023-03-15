package Even;

import java.util.Arrays;
import java.util.List;
public class EngClg {
	
	public static void main(String [] args) {
List<String> deptlist = Arrays.asList("CSE", "ECE", null, "ISE", null);
		
		String dept= deptlist.stream().findAny().get();
		
		System.out.println(dept);
		
	}
	

}
