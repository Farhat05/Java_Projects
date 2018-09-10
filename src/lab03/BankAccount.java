package lab03;

public class BankAccount {
	 String Title;
	 double Balance;
	 int Accnum;
	
	public BankAccount()
	{
		
	}
	
	public BankAccount(String title, double balance, int accnum) {
		super();
		Title = title;
		Balance = balance;
		Accnum = accnum;
	}
	
	public void Withdrawmoney(double amount)
	{
		
		if(amount>Balance)
		{
			System.out.println("Cannot withdraw money..Please enter less amount");
		}
		if(amount<Balance)
		{
			double total=Balance-amount;
			System.out.println("Amount withdrawn is "+amount+" Total Balance remaining is "+Balance);
					
		}
	}

}
