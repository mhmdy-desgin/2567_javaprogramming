import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name : ");
		String authorName = scan.nextLine();
		System.out.print("Input author e-mail : ");
		String authoremail= scan.nextLine();
		Author author1 = new Author(authorName,authoremail);
		System.out.print(author1);
		System.out.println();
		System.out.print("Input book title : ");
		String bookTitle = scan.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scan.nextInt();
		BOOK BOOK1 = new BOOK(bookTitle,author1,bookPage);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
