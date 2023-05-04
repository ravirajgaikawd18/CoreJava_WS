package BankAccount;

import java.util.HashSet;

public class TestAccount {

	public static void main(String[] args) {
		// int accno, String customerName, int balance, AccountType acc)
		BankAcc a1 = new BankAcc(101, "Ravi", 1000, AccountType.SAVING);
		BankAcc a2 = new BankAcc(102, "Guru", 2000, AccountType.CURRENT);
		BankAcc a3 = new BankAcc(103, "Mandy", 3000, AccountType.SAVING);
		BankAcc a4 = new BankAcc(101, "Kirrr", 4000, AccountType.LOAN);
		// Create Empty hashSet of Accounts
		HashSet<BankAcc> accounts = new HashSet<>();//size=0,capacity=16,load factor=0.75
		System.out.println("added" + accounts.add(a1));//t
		System.out.println("added" + accounts.add(a2));//t
		System.out.println("added" + accounts.add(a3));//t
		System.out.println("added" + accounts.add(a4));//f
		for (BankAcc a : accounts)
			System.out.println(a);
		System.out.println(a1.equals(a4));// t
		System.out.println(a1.hashCode() + " " + a4.hashCode());// same
	}

}
