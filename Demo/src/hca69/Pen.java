package hca69;

public class Pen 
{
	String brand;
	String color;
	double price;
	Pen(String brand, String color, double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	@Override
	public String toString()
	{
		String s;
		s= "["+brand+","+color+","+price +"]";
		return s;
	}
	@Override
	public boolean equals(Object o)
	{
		Pen p=(Pen)o; //downcasting Object o=new Pen()-upcasting
		boolean b=this.brand.equals(p.brand)&& this.color.equals(p.color)&& this.price==price;
		//this.brand is the current object and p.brand is object
		return b;
				
	}
}
	
	