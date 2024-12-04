import javax.swing.*;
import java.text.*;
public class Lab201 
{

	public static void main(String[] args) 
	{
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("Input many customer per bill"));
		final int BUFFET = 299;
		double totalPrice = BUFFET * numberofCustomer;
		System.out.printf("Total price is %,.2f baht.",totalPrice);
		int isMember;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		do 
		{
			 isMember = JOptionPane.showConfirmDialog(null,
					"Total price is "+ frm.format(totalPrice) + "baht."+
					"\nDo you have a member card?");
		}
		while(isMember==JOptionPane.CANCEL_OPTION);
		
		if(isMember==JOptionPane.YES_OPTION) 
		{
			double priceAfterDiscount = totalPrice *0.90 ;
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is "+frm.format(priceAfterDiscount)+" baht.");
		}
		else if (isMember==JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice)+" baht.");
		}
	}

}
