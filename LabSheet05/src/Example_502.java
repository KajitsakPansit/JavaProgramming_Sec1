import javax.swing.*;
public class Example_502 {
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("input your e-mail:");
		while(email.startsWith("@")||email.startsWith(" ")) {
			email = JOptionPane.showInputDialog("input your e-mail,again:");
		}
		email.toLowerCase();
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null,"Your e-mail is "+ email);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your email is not hotmail or "+"gmail dot com");
		}

	}

}
