
public class Author {
	private String name;
	private String email;
	private char gender;
public Author(String name,String email,char gender) {
	this.name=name;
	this.email=email;
	this.gender=gender;
}
public Author(String name,String email) {
	this.name=name;
}
public Author() {
	name= "";
	email="";
	gender=' ';
}
public String getName() {
	return this.name;
}
public String getEmail() {
	return this.email;
}
public String getGenderName() {
	if(gender=='m' || gender == 'M') {
		return "Male";
	}
	else if(gender=='f'||gender=='F') {
		return "Female";
	}
	else if(gender!='f'||gender=='F'&&gender=='m' || gender == 'M') {
		return "null";
	}
	return email;
}
public String toString() {
	return "Author name : "+name+"("+email+";"+getGenderName()+")";
}
}
