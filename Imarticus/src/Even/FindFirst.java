package Even;

import java.util.Arrays;
import java.util.List;

public class FindFirst {



	public static void main(String [] args) {
	List <String> cityList  = Arrays.asList(null, null, null, "HYD", "GOA", "DELHI");

	/*String name = cityList.stream().filter(x->x!=null).findFirst().get();
	System.out.println(name);*/
	//findfirst - HYD
	
	
	String name = cityList.stream().filter(y->y!=null).skip(2).findAny().get();
	
	System.out.println(name);//Delhi
	}
	
	
}
