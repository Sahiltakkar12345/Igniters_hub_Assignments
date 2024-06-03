package AOPSpring;

public class Account {
	int Accno;
	String holdername;
	double balance;
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getHoldername() {
		return holdername;
	}
	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		System.out.println("tostring called");
		return "Account [Accno=" + Accno + ", holdername=" + holdername + ", balance=" + balance + "]";
	}
		public void deposit(double amount)
		{	
			System.out.println("deposit called");
			balance=balance+amount;
		}
		public void withdrawl()
		{
			System.out.println("withdrawl called");
			balance=balance-2000;
		}
}
