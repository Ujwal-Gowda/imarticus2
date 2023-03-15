import java.util.InputMismatchException;
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		ICICI i = new ICICI();
		Fedral f = new Fedral();
		boolean flag = false;
		while(!flag)
		{
			System.out.println();
			
			System.out.println(" ================");
			System.out.println("|Welcome to Banks|");
			System.out.println(" ================");
			System.out.println("1.ICICI");
			System.out.println("2.Fedral");
			System.out.println("3.Exit");
			System.out.println("================");
			System.out.println("Choose the above option");
			try
			{
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
					{
						System.out.println("1.Deposit");
						System.out.println("2.Withdraw");
						System.out.println("3.Balance");
						try
						{
							int choice1 = sc.nextInt();
							switch(choice1)
							{
								case 1:
								{
									System.out.println("Enter the amount to deposit");
									double amount = sc.nextDouble();
									try
									{
										i.deposit(amount);
									}
									catch(DepositNotMultiplesOf500 e)
									{
										System.out.println("The amount is not in the multiples of 500");
									}
								}break;
								
								case 2:
								{
									System.out.println("Enter the amount to withdraw");
									double amount = sc.nextDouble();
									try
									{
										i.withdraw(amount);
									}
									catch(InsufficientBalanceException e)
									{
										System.out.println("Balamce is insufficent");
									}
									catch(WithdrawNotMultiplesOf100 e)
									{
										System.out.println("Amount is not withdrawn int the multiples of 100");
									}
								}break;
								
								case 3:
								{
									System.out.println(i.balance);
								}break;
								
								default:
								{
									System.out.println("Invalid option");
								}
							}
							
						}
						catch(InputMismatchException e)
						{
							System.out.println("Invalid Input for ICICI bank");
						}
					}break;
					
					case 2:
					{
						System.out.println("1.Deposit");
						System.out.println("2.Withdraw");
						System.out.println("3.Balance");
						try
						{
							int choice1 = sc.nextInt();
							switch(choice1)
							{
								case 1:
								{
									System.out.println("Enter the amount to deposit");
									double amount = sc.nextDouble();
									try
									{
										f.deposit(amount);
									}
									catch(DepositNotMultiplesOf1000 e)
									{
										System.out.println("The amount is not in the multiples of 500");
									}
								}break;
								
								case 2:
								{
									System.out.println("Enter the amount to withdraw");
									double amount = sc.nextDouble();
									try
									{
										f.withdraw(amount);
									}
									catch(InsufficientBalanceException e)
									{
										System.out.println("Balamce is insufficent");
									}
									catch(WithdrawNotMultiplesOf500 e)
									{
										System.out.println("Amount is not withdrawn int the multiples of 100");
									}
								}break;
								
								case 3:
								{
									System.out.println(f.balance);
								}break;
								
								default:
								{
									System.out.println("Invalid option");
								}
							}
							
						}
						catch(InputMismatchException e)
						{
							System.out.println("Invalid Input for ICICI bank");
						}
					}break;
					
					case 3:
					{
						flag = true;
					}
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input");
			}

		}

	}



 }


