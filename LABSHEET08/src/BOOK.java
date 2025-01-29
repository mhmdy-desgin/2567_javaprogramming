
public class BOOK {
	private String title;
	private Author author;
	private int page;
	
	//Constructor Method 
	BOOK(String title, Author author, int page){
		this.title=title;
		this.author= author;
		this.page=page;
	}
	
	BOOK(String title, Author author){
		this.title = title;
		this.author=author;
		this.page=0;
	}
	BOOK(){
		/*this.title=null;
		this.author=null;
		this.page=0;*/
		this(null,null,0);
		
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author) {
		
	}
	
	
	
}
