import javax.swing.*;
public class Example_503_1 {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again : ");
			sentence = JOptionPane.showInputDialog("Input a sentence,again:");
		}
		int spacebar = 0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
				//spacebar ++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+(spacebar)+" spacebar."
				+"\nThis sentence has "+(spacebar+1)+" word.");

	}

}
