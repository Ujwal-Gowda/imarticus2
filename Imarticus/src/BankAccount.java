interface BankAccount{
	void deposit(int amt);
	void withDraw(int amt);
	void showBalance();
}

class SBIBankAcc implements BankAccount{
	
	int balance;
	String name;
	
	
	public SBIBankAcc(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	@Override
	public void deposit(int amt) {
		if(amt < 50000) {
			this.balance = this.balance + amt;
			System.out.println("From SBI Bank....Successfully deposited amount..."+amt);
		}
		else System.out.println("From SBI Bank...."+amt+"...Not Permitted to deposit");
	}

	@Override
	public void withDraw(int amt) {
	
		if(amt < 50000) {
			if(amt < this.balance) {
				this.balance = this.balance - amt;
				System.out.println("From SBI Bank....Successfully withdrawn amount..."+amt);
			}
			else System.out.println("From SBI Bank....Insufficient Balance....");
		}
		else System.out.println("From SBI Bank....> 500000 Not Permitted to withDraw");
		
	}

	@Override
	public void showBalance() {
		System.out.println("From SBI Bank....Current Balance...."+this.balance);	
	}
	
}

class HDFCBankAcc implements BankAccount{
	
	int balance;
	String name;
	
	
	public HDFCBankAcc(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	@Override
	public void deposit(int amt) {
		if(amt < 200000) {
			this.balance = this.balance + amt;
			System.out.println("From HDFC Bank....Successfully deposited amount..."+amt);
			
		}
		else System.out.println("From HDFC Bank....Not Permitted to deposit");
		
	}

	@Override
	public void withDraw(int amt) {
		if(amt < 200000) {
			if(amt < this.balance) {
				this.balance = this.balance - amt;
				System.out.println("From HDFC Bank....Successfully withdrawn amount..."+amt);
				
			}
			else System.out.println("From HDFC Bank....Insufficient Balance....");
		}
		else System.out.println("From HDFC Bank....> 2000000 Not Permitted to withDraw");
				
	}

	@Override
	public void showBalance() {
		System.out.println("From HDFC Bank....Current Balance...."+this.balance);	
			
	}
	
}

public class PrintPrime {
	public static void main(String[] args) {
	
		BankAccount bankAccount;
	
		bankAccount = new SBIBankAcc(40000, "Ram");
		
		
		bankAccount.showBalance();
		bankAccount.deposit(40000);
		bankAccount.showBalance();
		bankAccount.withDraw(3000);
		bankAccount.showBalance();
		
		bankAccount.deposit(73000);
		bankAccount.showBalance();
		
		bankAccount.withDraw(52000);
		bankAccount.showBalance();
		
		
		// hdfc bank
		bankAccount = new HDFCBankAcc(20000, "Shyam");
		
		
		bankAccount.showBalance();
		bankAccount.deposit(75000);
		bankAccount.showBalance();
		bankAccount.withDraw(83000);
		bankAccount.showBalance();
		
		bankAccount = new AxisBankAcc(50000, "Abdul");
		
		
		bankAccount.showBalance();
		
	
	
	}
}

