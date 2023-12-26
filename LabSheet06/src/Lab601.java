import javax.swing.*;
public class Lab601 {
	public static void main(String[] args) {
		inputEmail();
	}
public static void inputEmail() {
	String inputEmail = JOptionPane.showInputDialog("Input your e-mail :").toLowerCase();
	while(inputEmail.startsWith("@")||inputEmail.startsWith(" "));{
		inputEmail = JOptionPane.showInputDialog("Input your e-mail again :");
	}
	boolean validateEmail = checkEmail(inputEmail);
	if(validateEmail) {      //validateEmail==true
		JOptionPane.showConfirmDialog(null, 
	"Your email is "+ inputEmail);
	}
	else {
		JOptionPane.showConfirmDialog(null, "Your email is not hotmail or gmail.com");
	}
}
public static boolean checkEmail(String email){
	if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
		return true;
	}
	else return false;
    }
}
