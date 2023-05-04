package BankAccount;

public class BankAcc {
//primary key account number
	private int accno;
	private String CustomerName;
	private int balance;
	private AccountType acc;

	public BankAcc(int accno, String customerName, int balance, AccountType acc) {
		super();
		this.accno = accno;
		CustomerName = customerName;
		this.balance = balance;
		this.acc = acc;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public AccountType getAcc() {
		return acc;
	}

	public void setAcc(AccountType acc) {
		this.acc = acc;
	}

	public int getAccno() {
		return accno;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", CustomerName=" + CustomerName + ", balance=" + balance + ", acc=" + acc
				+ "]";
	}

	// Primary key Account number
	@Override
	public boolean equals(Object o) {
		System.out.println("in acc eq");
		if (o instanceof BankAcc)
			return this.accno == ((BankAcc) o).accno;
		return false;
	}

	// override hashCode
	@Override
	public int hashCode() {
		System.out.println("in acc hc");
		return accno;
	}
}
