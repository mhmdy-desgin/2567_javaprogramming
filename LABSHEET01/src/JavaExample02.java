import javax.swing.*;
public class JavaExample02 
{

	public static void main(String[] args) 
	{
		String productName = JOptionPane.showInputDialog("Input Poduct Name");
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(strProductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog(""
				+"Input Price per Unit: "));
		double totalPriceofProduct = productUnit * productPrice;
		double totalwithVat = totalPriceofProduct * 1.07;
		String frmtotalwithvax = String.format("%,.2f", totalwithVat);
		JOptionPane.showMessageDialog(null, "Total price is "+totalPriceofProduct+
				" baht."+"\nADD VAT7% is "+frmtotalwithvax+ " baht.");
		
		
	}

}
