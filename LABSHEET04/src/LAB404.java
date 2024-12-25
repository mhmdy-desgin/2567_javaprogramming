import java.util.*;

public class LAB404 {

	public static void main(String[] args) {
		inputStudent();
		
	}
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while (true) {
			System.out.print("Enter subject ID (10 digits): ");
			studentID = scanner.nextLine();
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			isStudentIDValid = isLength(studentID, 10);
			isStudentIDValid = isLength(subjectCode, 7 );
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITstudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				displayData(isITstudent,isITSubject);
				break;
				
			}else {
				System.out.println("");
			}
			
		}
	}
	public static boolean isLength(String input , int len ) {
		
		return input.length()==len;
	}
	public static boolean isITStudent (String ID) {
		if (ID.length()==10) {
			return true;
		}else {
			return false;
		}
		
	}
	  private static boolean isITSubject(String id) {
	        if (id.startsWith("21") && id.charAt(4) == '1' ) return true;
	        return false;
	    }
	  private static void displayData(boolean student, boolean subject, String studentId, String subjectId) {
	        System.out.println();
	        System.out.print("Student id: " + studentId + " ");
	        if (!student) System.out.print("is not ");
	        System.out.println("1st year student in IT");
	        if (!subject) System.out.print("not ");
	        System.out.println("enroll in courses for Year 1");
	    }
}
