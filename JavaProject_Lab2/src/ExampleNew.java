import javax.swing.*;
import java.text.*;
public class ExampleNew {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input Product Name : ");

		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		String priceUnit = JOptionPane.showInputDialog("Input price per unit : ");
		float priceperUnit = Float.parseFloat(priceUnit);
		float totalprice = productUnit*priceperUnit;
		float vat = totalprice+(totalprice*7/100);
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalprice)+ "baht."
		+ "\nAdd Vat 7% is "+frm.format(vat)+"baht.");


	}

}
