/*
Create a program that helps banks to maintain records.
 It should have following facilities.
 o Anybody can create current or saving account with following initial information: account number, name, balance, and branch.
 o display account detail for a particular accounts.
 o display total money deposited in bank.
 o allow deposit and  withdrawal in an account.
 o for saving account opening balance and minimum balance must be 5000.
 o for current account opening balance and minimum balance must be 1000.
 o can not withdraw the amount from the account that makes balance less than the minimum balance. 
*/

import java.util.Scanner;
class CurrentAccount {

	private int accntno;
	private String name;
	private float balance;

	CurrentAccount(int accntno, String name){
		this.accntno = accntno;
		this.name = name;
		balance = 5000;
	}

}

class SavingAccount {

}

class AccountMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
	}
}