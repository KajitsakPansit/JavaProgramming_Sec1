import java.time.Year;

public class FictionBook implements Author,Book{
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	public FictionBook(String title,int publicYear) {
		this.author_name=author_name;
		this.email=email;
		this.title=title;
		this.publicYear=publicYear;
	}
	public void setAuthor(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	@Override
	public String getFirstName() {
		return this.author_name;
	}
	public String getLastName() {
		return this.author_name;
	}public boolean checkEmail() {
		if(email.endsWith("@hotmail.com")||email.endsWith("@windowslive.com")) {
			return true;
		}
		else
			return false;
	}
	@Override
	public String getTitle() {
		return this.getTitle();
	}
	public int totalPublicYear() {
		return Year.now().getValue()-this.publicYear;
	}
	public boolean checkFormatName() {
		if(this.author_name==this.getFirstName()+" "+this.getLastName()) {
			return true;
		}
		else
			return false;
	}
	public String toString() {
		return this.title+" write by "+"."+this.getFirstName()+"("+this.email+")"+"Published for "+this.totalPublicYear()+"year";
	}
}
