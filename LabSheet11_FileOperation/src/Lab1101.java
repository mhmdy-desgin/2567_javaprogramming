import java.util.*;
import java.io.*;
public class Lab1101 {
		static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
		
		
		

	}//end of main
	public static void printHeader(int sec) {
		System.out.println("****************************************************");
		System.out.println("\tList of Data for Section "+ sec);
		System.out.println("****************************************************");

	}//end of printHeader
	public static void displayStudentList(int sec) throws IOException{
		try(BufferedReader readfile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp ="";
			while((temp = readfile.readLine())!=null) {
				String[] data = temp.split("\t");
				
				if(data.length<6) continue; //ensure valid data format
				
				int studentSection = Integer.parseInt(data[3]); //แปลงกลุ่มเรียนในไฟล์ให้เป็น int
				
				if(studentSection==sec) {
					System.out.printf("%s  %s %s \t%s \t%s \t%s %n",data[0],data[1],data[2],data[3],data[4],data[5]);
				}
				
			}
			
			
		}
	}

}
