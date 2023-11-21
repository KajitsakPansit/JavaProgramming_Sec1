import 	javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm = new DecimalFormat("#,###.00");
		double inputWeight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
		double inputHeight = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
		inputHeight = inputHeight/100;
		double bmi = inputWeight/(inputHeight*inputHeight);
		String bmiCategory;
		if (bmi < 18.5) 
			bmiCategory = "Underwegiht";
		else if (bmi<25)
				bmiCategory = "Normal-weight";
		else if (bmi<=30)
			    bmiCategory = "Overweight";
		else
			    bmiCategory = "Obesuty";
		//JOptionPane.showMessageDialog(null, "BMI = "+ frm.format(bmi)+ "\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "BMI = "+ String.format("%.1f",bmi)+ "\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);

		
		

	}

}
