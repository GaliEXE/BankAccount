package bank_account;

class CheckingAccount extends BankAccount{
	
	/**
	 * Initialize Unique variables for the extended Checking Account Class
	 */
	static int interestRate;
	static int overdraftFee;
	
	/**
	 * This Method Creates Your Checking Account Using Information from the BankInterface Class And The Bank Account Class
	 * @param firstName
	 * @param lastName
	 * @param accountID
	 * @param balance
	 * @param interestRate
	 * @param overdraftFee
	 */
	public CheckingAccount(String firstName, String lastName, int accountID, double balance, int interestRate, int overdraftFee){
		super(firstName, lastName, accountID, balance);
		CheckingAccount.interestRate = 2;
		CheckingAccount.overdraftFee = 30;
	}
	
	/**
	 * Method For Creating A Bank Account
	 * @return Bank Account Information
	 */
	public static String displayAccount() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAccount ID: " + accountID + "\nBalance: " + balance + "\nInterest Rate: " + interestRate + "%";
	}
	
	/**
	 * Method For Adding An Overdraft Fee When Balance Goes Below 0.
	 */
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
