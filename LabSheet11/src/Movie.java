public class Movie  {

	private String id;

	private String name;

	private Director director;

	public Movie(String id,String name,Director director) {	

		this.id=id;

		this.name=name;

		this.director=director;

	}

	public Movie() {

		this.id="";

		this.name="";

	}

	public String getId(){

		return this.id;

	}

	public String getName() {

		return this.name;

	}

	public Director getDirector() {

		return this.director;

	}

	public void setDirector(Director director) {

		

	}

	public String toString() {

		return this.id+this.name+" direct by "+this.director.toString();

	}

	

}