package Even;

import java.util.Arrays;
import java.util.List;


public class UpperBCase {
	
	public static void main(String [] args) {
	
List<String> dataList = Arrays.asList("u", "j", "w", "a", 
		"l");
dataList.stream().map(x->x.toUpperCase()).forEach(y->System.out.println(y));
}

	
}



