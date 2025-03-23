package bank_account;

import java.util.Scanner;

	class BankAccount{
		
		static String firstName;
		static String lastName;
		static int accountID;
		static double balance;
		
		public BankAccount(String firstName, String lastName, int accountID, double balance ) {
			BankAccount.firstName = firstName;
			BankAccount.lastName = lastName;
			BankAccount.accountID = accountID;
			BankAccount.balance = 0;
		}
		
		public String accountSummary(String firstName, String lastName, int accountID, double balance) {
			return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAccount ID: " + accountID + "\nBalance: " + balance;
		}
		
		public static void deposit(double depositAmount) {
			try {
				balance = balance + depositAmount;
				System.out.println(depositAmount + " successfully added to your balance!");
			} catch (Exception e){
				System.out.println("There Was An Error, Try Again Later");
			}
		}
		
		public static void withdraw(double withdrawAmount) {
			try {
				balance = balance - withdrawAmount;
				System.out.println(withdrawAmount + " successfully removed from your account");
			} catch (Exception e) {
				
			}
		}
		
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

public class Main {

	public static void main(String[] args) {
		int idCreation = 000001;
		boolean runProgram = true;
		String firstName;
		String lastName;
		String userInput;
		double depositAmount;
		double withdrawAmount;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome To The Online Banking System");	
		System.out.println("It Appears You Don't Have An Account With Us Yet.");
		System.out.println("To Create An Account Please Enter Your First And Last Name");
		System.out.println("First Name: ");
		firstName = scnr.nextLine();
		System.out.println("Last Name: ");
		lastName = scnr.nextLine();
		System.out.println("Thank You For Creating An Account");
		System.out.println("Here Are Your Banking Details");
		CheckingAccount newCheckingAccount = new CheckingAccount(firstName, lastName, idCreation , 0.0, 2, 30);
		System.out.println("Account Successfully Created");
		System.out.println("Would You Like To Deposit, Withdraw, or Display Account?");
		System.out.println("COMMANDS: \ndeposit - To Make A Deposit \nwithdraw - To Make A Withdrawal \naccount - To View Account Details \nx - To Close Program");
		System.out.println("If You Do Not See The Command Prompt Press Enter");
		scnr.nextLine();
		
		while(runProgram) {
			System.out.print("COMMAND: ");
			userInput = scnr.nextLine().toLowerCase();
			switch(userInput) {
				case "deposit":
					System.out.println("Please Enter The Amount You Wish To Deposit: ");
					depositAmount = scnr.nextDouble();
					BankAccount.deposit(depositAmount);
					scnr.nextLine();
					break;
				case "withdraw":
					System.out.println("Please Enter The Amount You Wish To Withdraw: ");
					withdrawAmount = scnr.nextDouble();
					BankAccount.withdraw(withdrawAmount);
					CheckingAccount.processWithdrawal();
					scnr.nextLine();
					break;
				case "account":
					System.out.println(CheckingAccount.displayAccount());
					scnr.nextLine();
					break;
				case "x":
					System.out.println("Thank You For Using The Online Banking Service \nGoodbye!");
					scnr.close();
					runProgram = false;
					break;
				default:
					System.out.println("Not A Recognized Command. Please Try Again!");
					break;
			}
		}
		
		
	}
}
