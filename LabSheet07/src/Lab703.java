import java.util.*;
public class Lab703 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int input = scan.nextInt();
		while(input < 0 || input > 6) {
			System.out.print("Sorry ,"+input+" is the last index in array");
		}
	}

}
