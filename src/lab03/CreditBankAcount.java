package lab03;

public class CreditBankAcount extends BankAccount {

	double creditlimit=0;
	
	public CreditBankAcount(String title, double balance, int accnum,double cdlmt) {
		super();
		Title = title;
		Balance = balance;
		Accnum = accnum;
		creditlimit=cdlmt;
	}

	public void Withdrawmoney(double amount)
	{
		double limit=Balance+creditlimit;
		if(amount>Balance+creditlimit)
		{
			System.out.println("Cannot withdraw money..Please enter less amount");
		}
		if(amount<Balance+creditlimit)
		{
			
			double total=limit-amount;
			System.out.println("Amount withdrawn is "+amount+" Total remaining limit is "+total);
					
		}
	
}
	}
