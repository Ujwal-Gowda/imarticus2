
public class Fedral implements Bank
{
	double balance;
	
	public void withdraw(double amount)throws InsufficientBalanceException,WithdrawNotMultiplesOf500
	{
		if(amount<=balance)
		{
			if(amount%500==0)
			{
				System.out.println("Amount withdrawn is "+amount);
				balance = balance-amount;
				System.out.println("Updated balance is "+balance);
			}
			else
			{
				throw new WithdrawNotMultiplesOf500();
			}
		}
		else
		{
			throw new InsufficientBalanceException();
		}
	}
	
	public void deposit(double amount)throws DepositNotMultiplesOf1000
	{
		if(amount%1000==0)
		{
			System.out.println("Deposited amount is "+amount);
			balance = balance+amount;
			System.out.println("Updated balance is "+balance);
		}
		else
		{
			throw new DepositNotMultiplesOf1000();
		}
	}
}