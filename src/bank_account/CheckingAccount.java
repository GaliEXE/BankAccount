package bank_account;

class CheckingAccount extends BankAccount{
	
	static int interestRate;
	static int overdraftFee;
	
	public CheckingAccount(String firstName, String lastName, int accountID, double balance, int interestRate, int overdraftFee){
		super(firstName, lastName, accountID, balance);
		CheckingAccount.interestRate = 2;
		CheckingAccount.overdraftFee = 30;
	}
	
	public static String displayAccount() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAccount ID: " + accountID + "\nBalance: " + balance + "\nInterest Rate: " + interestRate + "%";
	}
	
	public static void processWithdrawal() {
		if(balance < 0) {
			try {
				balance = balance - overdraftFee;
				System.out.println("You have withdrawn too much money from your account, a 30$ fee has been assessed to your account");
			} catch (Exception e) {
				System.out.println("There Was An Error :(");
			}
		}
	}
	
}
