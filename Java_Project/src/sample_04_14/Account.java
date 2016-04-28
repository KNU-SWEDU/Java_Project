package sample_04_14;

public class Account {
	private int regNumer;
	private String name;
	private int balance;
	public int getRegNumer() {
		return regNumer;
	}
	public void setRegNumer(int regNumer) {
		this.regNumer = regNumer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account eq(Account ttt){
		Account temp = new Account();
		
		temp.name = ttt.name;
		temp.balance=ttt.balance;
		return temp;
		
	}

}
