package hca69;

public class Donating 
{

	int age;
	double weight;
     Donating(int age, double weight)
	{
		this.age=age;
		this.weight=weight;
	}
	public void checkEligibility() throws NotEligibleForDonating
	{
		if(age>=18 && weight>=55)
			System.out.println("You are eligible for donating blood");
		
		else
			throw new NotEligibleForDonating();
	}

}


