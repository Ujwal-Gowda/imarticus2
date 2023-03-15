
public interface Bank 
{
	public void withdraw(double amount) throws InsufficientBalanceException,WithdrawNotMultiplesOf100,WithdrawNotMultiplesOf500;
	public void deposit(double amount)throws DepositNotMultiplesOf500,DepositNotMultiplesOf1000;
}
