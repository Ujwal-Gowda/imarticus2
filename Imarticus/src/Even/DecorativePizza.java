package Even;

interface Pizza{
	void toppings();
	
}

class BasicPizza implements Pizza {

	@Override
	public void toppings() {
	System.out.println("Basic Topping");
	}
}

class PizzaDecorator implements Pizza{
	
	Pizza Pizza;

	public PizzaDecorator(Pizza pizza) {
		super();
		Pizza = pizza;
	}

	@Override
	public void toppings() {
		this.Pizza.toppings();
	}
	
	
}
class CheezyPizza extends PizzaDecorator{

	public CheezyPizza(Pizza pizza) {
		super(pizza);
		
	}
	@Override
	public void toppings() {
		super.toppings();
		
System.out.println("Added chesse in topping");

	}
		
}

class MushroomPizza extends PizzaDecorator{

	public MushroomPizza(Pizza pizza) {
		super(pizza);
		
	}
	@Override
	public void toppings() {
		super.toppings();
		
System.out.println("Added mushroom in topping");

	}
		
}



public class DecorativePizza {
	
		public static void main(String[] args) {
		
		
			
			Pizza p1 = new MushroomPizza(
					new CheezyPizza(new BasicPizza()
					)
					);
			
			p1.toppings();
			

		}
}
