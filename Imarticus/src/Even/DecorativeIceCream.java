package Even;

interface IceCream{
	void flavour();
}

class BasicIceCream implements IceCream{

	
	@Override
	public void flavour() {
	System.out.println("Basic Flavour");	
	}
	
}


class IceCreamDecarator implements IceCream{
	IceCream IceCream;
	
	public IceCreamDecarator(IceCream iceCream) {
		super();
		IceCream = iceCream;
	}

	@Override
	public void flavour() {
		this.IceCream.flavour();	
	}
	
}

class VanillaIceCream extends IceCreamDecarator{

	public VanillaIceCream(IceCream iceCream) {
		super(iceCream);
	}
	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Added vanilla flavour.....");
		
	}
}
class StrawBerryIceCream extends IceCreamDecarator{

	public StrawBerryIceCream(IceCream iceCream) {
		super(iceCream);
	}
	@Override
	public void flavour() {
		super.flavour();
		System.out.println("Added StrawBerry flavour.....");
		
	}
}



public class DecorativeIceCream {

	public static void main(String[] args) {
	
		IceCream iceCream = new VanillaIceCream( new BasicIceCream());
		iceCream.flavour();
		
		
		IceCream ic1 = new StrawBerryIceCream(
				new VanillaIceCream(new BasicIceCream()
				)
				);
		
		ic1.flavour();
		
		
		IceCream ic4 = new VanillaIceCream(
				new StrawBerryIceCream(new VanillaIceCream(new BasicIceCream())));
		
		ic4.flavour();
	}

}

