import java.io.*;
import java.util.*;
public class Lab1204 {
public static void main(String[] args) throws IOException{
Scanner scan = new Scanner(System.in);
FileReader file = new FileReader("d://txtFile//Bookdata.txt");
BufferedReader read = new BufferedReader(file);
String temp = "";
int i =1;
int book = 0;
System.out.print("Enter rating of book : ");
double input = scan.nextDouble();
System.out.println("--------------------------------------------------------------------------------");
while((temp = read.readLine()) !=null) {
String [] data = temp.split("\t");
double data2 = Double.parseDouble(data[2]);
if(data2>=input) {
System.out.println("Book  "+i+":"+data[0]+" write by"+data[1]+" ("+data[3]+")"+" reviews");
book+=1;
}
i++;
}
System.out.println("--------------------------------------------------------------------------------");
System.out.print("There are "+book+" book get rating more than "+input);
}
}