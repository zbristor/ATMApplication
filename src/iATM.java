
public interface iATM {
	public String sInput();
	public String pinInput();
	public String check(Account a);
	public double deposit(Account a,double d);
	public double withdraw(Account a,double w);
	public double checkBalance(Account a);
	public Account retrieve(String s, String p);
}
