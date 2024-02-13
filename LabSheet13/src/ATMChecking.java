import java.io.*;
import java.util.*;
public class ATMChecking extends ATMData {
	private int money;
	public ATMChecking (String account,String password,int money) {
		super(account,password);
		this.money = 0 ;
	}
	public boolean checkBookBank() throws IOException {
		Scanner scan = new Scanner(new File("d://txtFile//ATMBookBank.txt"));
		return false;
		
	}
	public void show() {
		
	}
}
