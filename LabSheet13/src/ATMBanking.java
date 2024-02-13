import java.util.*;
import java.text.*;
public class ATMBanking {
	public static void main(String[] args) {
		String account = "";
		String password = "";
		int money = 0;
		ATMChecking o2 = new ATMChecking(account,password);
		DecimalFormat df = new DecimalFormat("0-000-000-00-0");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number : ");
		account = df.format(scan.next());
		System.out.print("Enter password : ");
		password = scan.nextLine();
		System.out.print("Enter money : ");
		money = scan.nextInt();
	}

}
