public class Director {
	private String name;
	private String email;
	private char gender;
	public Director(String name ,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Director(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(this.gender=='m'||this.gender=='M') {
			return "Male";
		}
		else if(this.gender=='f'||this.gender=='F') {
			return "Female";
		}
		else
			return "Null";
	}
	public String toString() {
		return this.name+"("+this.email+";"+getGenderName()+")";

	}

}