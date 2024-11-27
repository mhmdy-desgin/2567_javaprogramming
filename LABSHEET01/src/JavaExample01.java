import java.util.*;
import java.text.*;

public class JavaExample01
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product name: ");
		String productName = input.nextLine();
		System.out.print("Input product unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println();
		System.out.println("Total Price is "+frm.format(totalPriceofProduct)+"baht.");
		float totalwithvax = totalPriceofProduct + (totalPriceofProduct*7/100);
		System.out.println("Add VAT 7% is "+totalwithvax + "baht.");
		System.out.println();
		String frmtotalwithvax = String.format("%,.2f", totalwithvax);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7% is "+ frmtotalwithvax+"baht.");
		System.out.println();
		System.out.println("Output using printf");
		System.out.printf("Add VAT7%% is %,.2f", totalwithvax);
		input.close();
	}

}
