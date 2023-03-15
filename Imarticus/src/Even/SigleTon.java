package Even;

// singleton class
 class Customer{
	 int id;
	 String name;
	static Customer  c1 = null;
	private Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public static Customer getCust() {
		
	
		if( c1 == null) {
			c1 = new Customer(12, "raj");
			
		}
		return  c1;
	}
	 
	
}


public class SigleTon {
	public static void main(String[] args) {
   
		Customer c1 = Customer.getCust();
		Customer c2 = Customer.getCust();
		


		if(c1 == c2) System.out.println("Both are Same");
		else System.out.println("Not Same");
		
		
}
}