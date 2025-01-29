import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom: ");
		int numberofStudent = scan.nextInt();
		scan.nextLine();
		//create an array on student objects
		Student[] students = new Student[numberofStudent];
		//Input information for each students
		for(int i=0; i<numberofStudent;i++) {
			//2.Create a new student object 
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+ (i+1));
			Line();
			//Input Student's name
			System.out.print("Input student name : ");
			String stdName= scan.nextLine();
			students[i].setName(stdName);
			while(true) {
				System.out.print("Input student score : ");
				int score = scan.nextInt();
				//Consume newline character 
				scan.nextLine();
				students[i].setScore(score);
				if(students[i].checkScore()) {
					break;
				}else {
					System.out.print("Input score , again : ");
				}
			}//end while loop
			//Display the list of students who passed 
			


			
		} //end of for
		 
		System.out.println("LIST OF PASS STUDENT (>=50)");
		Line();
		for(Student student : students ) {
		    if(student!=null && student.isPass()) {
		        System.out.println(">> "+ student.getName()+ "("+student.getScore()+")");
		    }
		}
		
		
		
		
		scan.close();
	}
	
	
	public static void Line() {
		for(int i=1;i<=60;i++) {
			System.out.print("-");
			
		}
		System.out.println();
	}
public static  String findGrade(int score) {
		if (score>=80) return "A";
		else if (score>=76) return"B";
		else if (score>=70) return"C";
		else if (score>=66) return"D";
		else if (score>=60) return "E";
		return "F";
		
	}
}

