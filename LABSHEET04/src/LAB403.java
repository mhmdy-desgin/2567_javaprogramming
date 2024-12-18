import java.io.InterruptedIOException;
import java.util.*;
public class LAB403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Fullname;// input first name entered by user
		String Firstname;// input full name extracted from the input.
		System.out.println("Please enter your name, separated by a space.");
		System.out.print(":");
		Fullname = input.nextLine();
		int space = Fullname.indexOf(' ');
		Firstname = Fullname.substring(0, space);//first of the name
		System.out.println(abbreviatName(Fullname) +Firstname);
		
		input.close();

	}
	public static String abbreviatName(String fName) {
		String initialLetter="";
		for(int i=0;i<fName.length();i++) {
			if (fName.charAt(i)==' ') {
				initialLetter= (initialLetter+fName.charAt(i+1)).toUpperCase();	
				initialLetter = initialLetter+".";
			}
		}
		return initialLetter;
	}

}
