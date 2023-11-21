import javax.swing.*;
public class Icecream {

	public static void main(String[] args) {
		int Choose ;
		int Vanilla = 10;
		int Choccolate = 15;
	
		do{
			Choose = Integer.parseInt(JOptionPane.showInputDialog("[1]Vanilla Flavor 10 B."
					+ "\n[2]Chocolate Flavor 15 B.\n"
					+ "Press number to choose flavor."));
		}while (Choose == JOptionPane.CANCEL_OPTION);
		if (Choose !=1 || Choose !=2) {
			JOptionPane.showMessageDialog(null, "ERROR: Wrong choice1\nTry again");
		}
		else
			//JOptionPane.showMessageDialog(null, "Do you want to add topping?");
		JOptionPane.showConfirmDialog(null, "Do you want to add topping");
		}
			
			

	}


