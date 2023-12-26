import java.util.*;
public class Lab701 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[7];
		int odd=0;
		int answer=0;
		for (int i =0;i<num.length;i++) {
			System.out.print("Input Number "+(i+1)+" : ");
			num[i]=scan.nextInt();
			if (num[i]%2==0) {
				odd++;
			}
		}
		System.out.println();
		System.out.println("There are "+odd+" of odd number.");
		System.out.print("List of odd number : ");
		//total(num);   //Method foreach  
		
		for(int _num : num) {
			if(_num%2!=0) {
			System.out.print(_num+" ");
			}
		}
	}
}
/*public static void total(int[] num) {   
	for (int _num : num ) {
		if(_num%2!=0) {
			int answer=0;
			answer = _num;
			System.out.print(answer+" ");
			
}
}
}
}*/
