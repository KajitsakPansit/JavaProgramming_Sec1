public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	//Default Constructor Composition
PersonalInfo(){
	name = new Person();//firstName ="",lastName=""
	bDay = new Date();//dMonth = 1,dDay = 1,dYear 1900
	personID =0;
}
//Constructor with parameter
public PersonalInfo(String first,String last,int month,int day,int year,int ID) {
	name = new Person(first,last);
	//Parameter
	bDay = new Date(month,day,year);
	personID = ID;
}
public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
	name.setName(first, last);
	bDay.setDate(month, day, year);
	personID = ID;
}
public String toString() {
	return "Name : "+name+"\nDate of birth : "+bDay+"\nPersonal ID : "+personID;
}
}
