package Even;

interface House{
	void availability();
}

class BasicHouse implements House{

	@Override
	public void availability() {
		System.out.println("Basic 2BHK house");	

	}
	
}
class HouseDecorator implements House{
	
	House House;
	public HouseDecorator(House house) {
		super();
		House = house;
			
	}

	@Override
	public void availability() {
		this.House.availability();
		
	}	
	
}
class SemiLuxuryHouse extends HouseDecorator{

	public SemiLuxuryHouse(House house) {
		super(house);
		
	}
	@Override
	public void availability() {
		super.availability();
		System.out.println("Added Balcony.....");
	
	}
}
	class LuxuryHouse extends HouseDecorator{

		public LuxuryHouse(House house) {
			super(house);
			
		}
		@Override
		public void availability() {
			super.availability();
			System.out.println("Added Balcony with gym .....");
		
		}
	}
		
public class DecorativeHouse {
	
	public static void main(String[] args) {
		
		House house = new SemiLuxuryHouse( new BasicHouse());
		house.availability();
		
		
		House h1 = new LuxuryHouse(
				new SemiLuxuryHouse(new BasicHouse()
				)
				);
		
		h1.availability();
		
		
		House h2 = 
				new LuxuryHouse(new SemiLuxuryHouse(new BasicHouse()));
		
		h2.availability();
	}

}



