/**
 * Homework Assignment number 1 
 * @author Joe Lashine
 *Data Structure and Analysis
 *Transferring Funds
 */

import java.util.*;
import java.util.Scanner;
public class Test_Account {

	public static void main(String[] args) {
    Scanner console = new Scanner(System.in); //Scanner
	double balance; // Instance variables
	long acctNum;
	String name;
	Account account1;
	Account account2;
	double balance2; 
	long acctNum2;
	String name2;
	boolean t = true;
	
	
	System.out.println("Enter the intial balance of account one: "); // Gathers user input for account one.
	balance = console.nextDouble();
	
	System.out.println("Enter your bank account number of account one: "); // Enter the account number for account one.
	acctNum = console.nextLong();
	
	System.out.println("Enter your last name of account one: ");      //Enter the last name of owner of account one.
	name = console.next();
	
	System.out.println("Enter the intial balance of account two: "); // Gathers user input for account one.
	balance2 = console.nextDouble();
	
	System.out.println("Enter your bank account number account two: "); // Enter the account number for account one.
	acctNum2 = console.nextLong();
	
	System.out.println("Enter your last name of account two: ");      //Enter the last name of owner of account one.
	name2 = console.next();
	
	account1 = new Account(balance, name, acctNum);       // Sets the instance variables into the correct parameters to set account one
	account2 = new Account(balance2, name2, acctNum2);      // Sets the instance variables into the correct parameters to set account two
	System.out.println(account1); //Prints the information of account one
	System.out.println(account2); //Prints the information of account two

	
	System.out.println("Would you like to enter a deposit to account number" + " " + account1.getAcctNum() + ", enter 0 if you dont"); //Asks the user to enter a deposit for account one.
	double deposit = console.nextDouble();
	account1.depositAcct(deposit);
	
	System.out.println("Would you like to enter a withdrawal to account number" + " " + account1.getAcctNum() + ", enter 0 if you don't"); //Asks the user if they want to enter a withdrawal to account one
	 double withdrawal = console.nextDouble();
	 account1.withdrawAcct(withdrawal);
	 
	 System.out.println("Would you like to enter a deposit to account number" + " " + account2.getAcctNum() + ", enter 0 if you dont"); //Asks the user to enter a deposit for account two
		double deposit2 = console.nextDouble();
		account2.depositAcct(deposit2);
		
		System.out.println("Would you like to enter a withdrawal to account number" + " " + account1.getAcctNum() + ", enter 0 if you don't");  //Asks the user if they want to enter a withdrawal to account two
		 double withdrawal2 = console.nextDouble(); // Gets user to enter withdrawal for account 2. 
		 account2.withdrawAcct(withdrawal2); // Uses 
	 
	 System.out.println("Your account balance for account one is now : \n" + account1.getBalance()); // Prints the new account balance of account one
	 System.out.println("Your account balance for account two is now : \n" + account2.getBalance()); // Prints the new account balance of account two
	 
	  while (t) { // While t remains true the account will keep making transfer until you tell it to stop.
		   System.out.print("Enter the account number you want to transfer money to: ");
		   
		   int account = console.nextInt(); // Makes you enter the account number of which account you want to transfer money to.

		   if (account == account1.getAcctNum()) //If the account you entered was account one then the money will be transfered from account 2 into account one.
		   {
		       System.out.print("How much money do you want transferred to  account one " + account1.getAcctNum() + " from account two " + account2.getAcctNum()+ ":" ); //Getting the amount of money from account 2 to transfer to account one.
		       double amount = console.nextDouble();
		       Account.transfer(account1, account2, amount);
		   } 
		   
		   else if (account == account2.getAcctNum()) // If you did not enter account one, it will go to this statement amnd read in account 2
		   {
		       System.out.print("How much money do you want transferred to account two " + account2.getAcctNum() + " from account one " + account1.getAcctNum() + ":"); // Gets the user to enter the amount of money to transfer into account 2 from account one
		       double amount = console.nextDouble();
		      
		       Account.transfer(account2, account1, amount); //Uses the transfer method from the account class 
		   } 
		   else
		   {
		       System.out.println("This is not a valid account number.");
		   }
		   System.out.print("Would you like to make another transaction between the accounts? (y for yes /n for no) \n");// If the  user enters y, the program will run another transfer. If the user enters n, the program will end. 
		   t = (console.next().toUpperCase().equals("Y")) ? true : false; //Reads in the user input for t and if y the program will run another transaction while if you say n the program will terminate.
		   }

		   System.out.println(account1); //Prints account number one
		   System.out.println(account2);  //Prints account number two
		}
	 
		
	}

