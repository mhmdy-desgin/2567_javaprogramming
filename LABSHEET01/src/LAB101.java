import java.text.*;
import java.util.*;
public class LAB101
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input product Name: ");
		String productName = input.nextLine();
		System.out.print("Input product Unit: ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit: ");
		float productPrice = input.nextFloat();
		float totalPriceofProduct = productUnit * productPrice;		
		System.out.print("---------------------------------------");
		System.out.print("\nTotal Price is "+ frm.format(totalPriceofProduct) + " baht.");
		System.out.print("\n---------------------------------------");
		System.out.print("\nHow many is discount (%) : ");
		int Discount = input.nextInt();
		System.out.println("---------------------------------------");
		float productDiscount = totalPriceofProduct*Discount/100;
		System.out.print("Discount from "+Discount+"%		"+frm.format(productDiscount)+" baht.");
		float totalPriceofDiscount = totalPriceofProduct - productDiscount ;
		System.out.print("\nAmount to be paid 		"+frm.format(totalPriceofDiscount)+" baht.");
		
	}

}
