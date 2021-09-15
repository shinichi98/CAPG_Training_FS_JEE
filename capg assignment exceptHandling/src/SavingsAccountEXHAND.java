class IllegalBankTransactionException extends Exception{
	public IllegalBankTransactionException() {
		super("Amount that you entered is not valid");
	}
}
class InsufficienBalanceException extends Exception{
	public InsufficienBalanceException() {
		super("Insufficient Balance");
	}
}
class SavingAccount{
	private long id;
	private double balance;
	
	public SavingAccount(long id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws InsufficienBalanceException,IllegalBankTransactionException{
		if(amount<0)
			throw new IllegalBankTransactionException();
		else if(balance==0 || amount>balance)
			throw new InsufficienBalanceException();
		else {
			System.out.println("Total amount deducted from " + balance +" is "+amount);
			this.balance-=amount;
			return this.balance;
		}
	}
	public double deposit(double amount) {
		this.balance+=amount;
		return this.balance;
	}
	public void updateBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
}
public class SavingsAccountEXHAND {
	public static void main(String[] args) {
		SavingAccount savings=new SavingAccount(11001202,100220);
		try {
			System.out.println("Total balance left is : "+ savings.withdraw(100000));
			//System.out.println("Total balance left is : "+ savings.withdraw(20000));
			System.out.println("Total balance left is : "+ savings.withdraw(-1000));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
}
