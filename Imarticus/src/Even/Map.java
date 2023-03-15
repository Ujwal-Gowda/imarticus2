package Even;

import java.util.Arrays;
import java.util.List;

public class Map {
	
public static void main(String [] args) {
	
	List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
	
	numList.stream().map(x->x*100).forEach(y->System.out.println(y));
	
}
}
