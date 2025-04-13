package bank_account;

public class BankAccount {

	/**
	 * Create BankAccount Methods
	 */
	static String firstName;
	static String lastName;
	static int accountID;
	static double balance;
	
	/**
	 * This Method Initializes all variables and sets the defaults.
	 * @param firstName
	 * @param lastName
	 * @param accountID
	 * @param balance
	 */
	public BankAccount(String firstName, String lastName, int accountID, double balance ) {
		BankAccount.firstName = firstName;
		BankAccount.lastName = lastName;
		BankAccount.accountID = accountID;
		BankAccount.balance = 0;
	}
	
	/**
	 * This Method Returns Account Information
	 * @param firstName
	 * @param lastName
	 * @param accountID
	 * @param balance
	 * @return Bank Account Information
	 */
	public String accountSummary(String firstName, String lastName, int accountID, double balance) {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAccount ID: " + accountID + "\nBalance: " + balance;
	}
	
	/**
	 * This Method Takes Information From BankInterface Class When The Users Wishes To Make A Deposit
	 * @param depositAmount
	 */
	public static void deposit(double depositAmount) {
		try {
			if(depositAmount > 0) {
				balance = balance + depositAmount;
				System.out.println(depositAmount + " successfully added to your balance!");
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Not A Valid Number, Please Enter A Valid Number!");
		}catch (Exception e){
			System.out.println("There Was An Error, Try Again Later");
		}
	}
	
	/**
	 * This Method Takes Information From BankInterface Class When The User Wishes To Make A Withdrawal
	 * @param withdrawAmount
	 */
	public static void withdraw(double withdrawAmount) {
		try {
			if(withdrawAmount > 0) {
				balance = balance - withdrawAmount;
				System.out.println(withdrawAmount + " successfully removed from your account");
			}else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Not A Valid Number, Please Enter A Valid Number!");
		} catch (Exception e) {
			System.out.println("There Was An Error, Try Again Later");
		}
	}
	
	
	/**
	 * Setters And Getters For All Variables In The BankAccount Class
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAccountID() {
		return accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setFirstName(String firstName) {
		BankAccount.firstName = firstName;
	}
	public void setLastName (String lastName) {
		BankAccount.lastName = lastName;
	}
	public void setAccountID(int accountID) {
		BankAccount.accountID = accountID;
	}
	public void setBalance(double balance) {
		BankAccount.balance = balance;
	}
}
