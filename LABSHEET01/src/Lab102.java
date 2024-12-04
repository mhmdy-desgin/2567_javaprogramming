import java.util.*;
public class Lab102 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input product the number of minutes: ");
		int minutes = input.nextInt();
		int years = minutes/525600;
		double days = minutes%525600/1440;
		double otherdays = days*24;
		System.out.print(" "+minutes+" minutes is approxiamately "+years+" years and "+days+"days");
		
	}

}
