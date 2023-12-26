import java.util.*;
public class Lab_Example703 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i]=scan.nextInt(); 
		}
		int totalNumber = sumOfPos(num);
		System.out.print("Summation of possitive number is "+ totalNumber);
	}
	public static int sumOfPos(int[] nums) {
		int sum =0;
		for(int _nums : nums) {
			if(_nums>0) {
				sum += _nums;// sum= sum + _nums;
			}
		}
		return sum;
	}
}

