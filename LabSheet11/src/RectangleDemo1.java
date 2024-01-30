import javax.swing.*;
public class RectangleDemo1 {
	public static void main(String[] args) {
		//Input data
		/*double widthInput =Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput=Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		//send 3 argument 
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		//show the width,length,color
		JOptionPane.showMessageDialog(null, obj1+"\n"+"Area of Rectangle = "+obj1.getArea());
		}*/
		double widthInput =Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput=Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2.toSring()+"\nArea of Rectangle = "+obj2.getArea());
	}
		
}
