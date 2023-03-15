

public class ICICI implements Bank
{
	double balance;
	
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException,WithdrawNotMultiplesOf100 
	{
		if(amount<=balance)
		{
			if(amount%100==0)
			{
				System.out.println("Amount withdrawn is "+amount);
				balance = balance-amount;
				System.out.println("Updated balance is "+balance);
			}
			else
			{
				throw new WithdrawNotMultiplesOf100();
			}
		}
		else
		{
			throw new InsufficientBalanceException();
		}
	}
	
	public void deposit(double amount) throws DepositNotMultiplesOf500
	{
		if(amount%500==0)
		{
			System.out.println("Deposited amount is "+amount);
			balance = balance+amount;
			System.out.println("Updated balance is "+balance);
		}
		else
		{
			throw new DepositNotMultiplesOf500();
		}
	}
}