package Even;

public class Odd {
public class Test {

	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			if(isNumEven(i) == false) {
				if(isNumHaving3Or7Digit(i) == true) 
					{
						System.out.println(i);
					}// 6 digit num if
			}// even num if
		}// for
	}
	
	// 3612
	// write a program to find between 100 to 200 odd numbers and last digit should be either 3 or 7?
	
	
	
	private static boolean isNumHaving3Or7Digit(int m) {
		
		return (m % 10 == 3) || (m % 10 == 7)?true:false;
	}

	private static boolean isNumEven(int num) {
		
		return num % 2 ==0;
	}

}

}
