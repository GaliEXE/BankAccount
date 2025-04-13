package bank_account;

import java.util.Scanner;

public class BankInterface {

	public static void main(String[] args) {
		
		/**
		 * Initialize Variables for Bank Account Creation
		 * and variables for running program loop and withdraw and deposit user inputs.  
		 */
		int idCreation = 000001;
		boolean runProgram = true;
		String firstName;
		String lastName;
		String userInput;
		double depositAmount;
		double withdrawAmount;
		
		/**
		 * Main Interface for interacting With Program
		 * Will Create Your "Account" and ask you how you wish to proceed via commands.
		 */
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome To The Online Banking System");	
		System.out.println("It Appears You Don't Have An Account With Us Yet.");
		System.out.println("To Create An Account Please Enter Your First And Last Name");
		System.out.println("First Name: ");
		firstName = scnr.nextLine();
		System.out.println("Last Name: ");
		lastName = scnr.nextLine();
		System.out.println("Account Successfully Created");
		System.out.println("Thank You For Creating An Account");
		CheckingAccount newCheckingAccount = new CheckingAccount(firstName, lastName, idCreation , 0.0, 2, 30);
		System.out.println("Would You Like To Deposit, Withdraw, or Display Account?");
		System.out.println("COMMANDS: \ndeposit - To Make A Deposit \nwithdraw - To Make A Withdrawal \naccount - To View Account Details \nx - To Close Program");
		System.out.println("If You Do Not See The Command Prompt Press Enter");
		scnr.nextLine();
		
		/**
		 * Main loop to handle and run commands as they are entered
		 */
		while(runProgram) {
			System.out.print("COMMAND: ");
			userInput = scnr.nextLine().toLowerCase();
			switch(userInput) {
				case "deposit":
					System.out.println("Please Enter The Amount You Wish To Deposit: ");
					depositAmount = scnr.nextDouble();
					BankAccount.deposit(depositAmount);
					/**
					 * This Scanner is used to ensure that the scanner works correctly when the program loops
					 * as is all empty scnr.nextLine();'s used in this program. 
					 */
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
