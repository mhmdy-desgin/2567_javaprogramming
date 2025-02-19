
public class FictionBook {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	private String fname;
	private String lname;
	FictionBook(){
		this.author_name = null;
		this.email = null;
		this.title = null;
		this.publicYear = 0;
		this.fname = null;
		this.lname = null;
	}
	FictionBook(String title , String publicYear){
		this.title = title;
		this.publicYear= (int)publicYear;
	}
}
