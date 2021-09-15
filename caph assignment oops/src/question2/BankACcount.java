package question2;

public class BankACcount {
	public static void main(String[] args) {
        Account b1 = new SavingsAccount();
        int a=b1.totalCash();
        Account b2 = new CurrentAccount();
        int b=b2.totalCash();
        System.out.println("Total cash is " + (a+b));
    }
    
}
class Account{
	int amount=100;
	public int totalCash() {
        System.out.println("Total cash is " + amount);
        return amount;
    }
}
class SavingsAccount extends Account{
	int fixeddeposit=100;
	@Override
	public int totalCash() {
        System.out.println("Total cash is " + (amount+fixeddeposit));
        return (amount+fixeddeposit);
    }
}
class CurrentAccount extends Account{
	int cashcredit=100;
	@Override
	public int totalCash() {
        System.out.println("Total cash is " + (amount+cashcredit));
        return (amount+cashcredit);
    }
}