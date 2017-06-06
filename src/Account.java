
public class Account {
	private String accNum;
	private String userName;
	private double balance;
	private String pin;
public Account(String accNum, String userName, double balance, String pin){
	this.accNum=accNum;
	this.userName=userName;
	this.balance=balance;
	this.pin=pin;
}
public Account() {
	// TODO Auto-generated constructor stub
}
public String getAccNum() {
	return accNum;
}
public double deposit(double d, double balance)
{
	return balance+d;
}
public double withdraw(double w, double balance)
{
	return balance-w;
}
public void setAccNum(String accNum) {
	this.accNum = accNum;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}

}
