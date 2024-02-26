package sec3;

public class Account {
	private String bankName;
	private String myName;
	private int accountNumber;
	private int money;
	
	public void inMoney(int m) {
		money += m;
	}
	
	public void outMoney(int m) {
		money -= m;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println(this.bankName + "\t" + this.myName + "\t" 
				+ this.accountNumber + "\t" + this.money);
	}
}
