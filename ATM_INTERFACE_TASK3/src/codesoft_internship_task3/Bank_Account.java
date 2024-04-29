/**
 * 
 */
package codesoft_internship_task3;
/**
 * 
 */import java.util.Scanner;

public class Bank_Account {
private double balance;
public Bank_Account(double initialBalance)
{
 balance = initialBalance;
}
public double getBalance()
{
	return balance;
}
public void deposit(double amount)
{
	balance += amount;
}
public boolean withdraw(double amount)
{
	if(amount <= balance)
	{
		balance -= amount;
		return true;
	}
return false;
	}
}
class ATM
{
	private Bank_Account account;
	public ATM(Bank_Account bankAccount)
	{
		account = bankAccount;
	}	
	public void displayMenu()
	{
		System.out.println("ATM Menu");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.print("4. Exit:");
	}
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			displayMenu();
			System.out.print("Select an option:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Your Balance is: Rs." +account.getBalance());
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double depositAmount = sc.nextDouble();
				account.deposit(depositAmount);
				System.out.println("Deposited Successfully. Your Balance is:" + account.getBalance());
				break;
			case 3:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = sc.nextDouble();
				if(account.withdraw(withdrawAmount))
				{
					System.out.println("Withdrawal Successfully. Your Balance is: " + account.getBalance());
				}
				else
				{
					System.out.println("Insufficient Balance:");
				}
				break;
			case 4:
				System.out.println("Thank you for using the ATM");
				sc.close();
				return;
				default:
					System.out.println("Invalid Option. Please select a valid option.");
			}
		}
					
			}
		}
class Main
{
	public static void main(String[]args)
	{
		
		Bank_Account userAccount = new Bank_Account(1000);//Initial Balance
		ATM atm = new ATM(userAccount);
		atm.run();
	}
}
