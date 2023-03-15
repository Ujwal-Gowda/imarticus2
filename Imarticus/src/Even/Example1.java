package Even;

@FunctionalInterface
interface Office{
	float calSalary(int basicsalary,int exp);
}
public class Example1 {

	public static void main(String[] args) 
	{
		Office e1=(basic,exps)->(float) ((basic+(basic*0.4))-exps);
        System.out.println(e1.calSalary(50000, 2000));
	}
}



