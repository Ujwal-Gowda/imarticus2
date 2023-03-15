package Even;

public class Test {

	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			if(isNumEven(i) == true) {
				if(isNumHaving6Digit(i) == true) 
					{
						System.out.println(i);
					}// 6 digit num if
			}// even num if
		}// for
	}
	
	// 3612
			
private static boolean isNumHaving6Digit(int m) {
		
		// m = 3612
		int r;
		while(m !=0) {
			r = m % 10;// 3612 % 10----2
			m = m /10;// 3612 / 10----361
			if(r == 6) return true;
		}
		
		return false;
	}

	private static boolean isNumEven(int num) {
		
		return num % 2 ==0;
	}

}