package hca69;

public class MainPen {

	public static void main(String[] args) {
		Pen p1=new Pen("Cello", "black", 5.1);
		Pen p2=new Pen("Jiffy", "black", 5.1);
		Pen p3=new Pen("Cello", "black", 5.1);
		Pen p4=new Pen("Cello", "black", 5.1);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
	System.out.println(p4);
	System.out.println(p1.equals(p2));
	System.out.println(p1.equals(p3));
	System.out.println(p3.equals(p4));
	}

}
