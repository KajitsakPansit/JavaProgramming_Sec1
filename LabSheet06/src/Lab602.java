import javax.swing.*;
public class Lab602 {
	public static void main(String[] args) {
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		while(!checkYear(inputyear)) {
		inputyear = Integer.parseInt(JOptionPane.showInputDialog("Please input year between 1000-3000,\nInput year again:"));
		}
		/*if(isLeapYear(inputyear)==true) {
			JOptionPane.showMessageDialog(null, inputyear + " is Leap Year");
		}
		else 
			JOptionPane.showConfirmDialog(null, + inputyear +" is NOT leap year");*/
		JOptionPane.showConfirmDialog(null,isLeapYear(inputyear)?inputyear + " Leap Year":inputyear+ " is ont Leap Year ");
	}//end main
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||year%400==0)) {
			return true;
		}
		else return false;
	}//end Leap
    public static boolean checkYear(int year) {
    	if(year >= 1000&&year <=3000) {
    		return true;
    	}
    	else return false;
    }//end check

}
