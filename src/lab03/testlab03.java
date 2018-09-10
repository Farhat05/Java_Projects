package lab03;

public abstract class testlab03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba=new BankAccount("Current",4000.544,23232);
		CreditBankAcount cab=new CreditBankAcount("Current",4000.544,23232,3000);
		ba.Withdrawmoney(7000);
		cab.Withdrawmoney(7000);
	}

}
