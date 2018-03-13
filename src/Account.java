import java.text.DecimalFormat;
import java.util.*;
/**
 * Homework Assignment number 1 
 * @author Joe Lashine
 *Data Structure and Analysis
 *Transferring Funds
 */
public class Account {

	private double balance;
	private String lastname;
	private long acctNum;
	DecimalFormat df = new DecimalFormat("0.##");
	public Account(double argBalance, String argName, long argAcctnum) //Constructor for the account that initializes the account balance, the last name of the account owner, and the account number.
	{
		balance = argBalance;
		lastname = argName;
		acctNum = argAcctnum;
	}
	
	public void withdrawAcct(double withdrawal)// First it checks to see if the account balance has sufficient funds in the account.
                                                // Use an if statement so if there is enough money in the account the program will go through with the withdraw but if there is insufficient funds the program will give you an error and terminate.
	{
		if (balance >= withdrawal)
         {
	balance -= withdrawal;
         }
		 else
		 {
			System.out.println("You do not have enough money in your account for this withdrawal"); // Error message if you did not enter the right account.
		 }
	}
public void depositAcct(double deposit) // takes the current balance and adds the deposit through the use of one parameter and then saves the new current balance.
{
	balance = balance + deposit;
}
public double getBalance() // Returns the balance of the account after the transactions
{
	return  balance;
}
public long getAcctNum() // Returns the account number 
{
	return acctNum;
}
public String toString() // Use a string method to  print out the account information (last name, account number, and balance)
{
	return ("Your Last Name: " + lastname + ". " + "Your Account Number: " + acctNum + ". " + "Your Account Balance: " + balance + ". \n"); //returns account
}

 public void transfer(Account account, double balance) //Takes two parameters and decides if it should be added or subtracted
 {
     this.balance = this.balance + balance;
     account.balance = account.balance - balance;
 }

 
 public static void transfer(Account account1, Account account2, double amount) //Takes two Account objects and an amount and transfers the amount from the first account to the second account
 {
     account1.balance = account1.balance + amount;
     account2.balance = account2.balance - amount;
 }

 
 

 
		}
	
	

