import java.text.DecimalFormat;
import java.util.*;

import javax.swing.JOptionPane;
public class Withdrawal {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		//System.out.println(balance);
		DecimalFormat frm = new DecimalFormat("#,###");
		int Withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your Balance: "+frm.format(balance)+
				"\nInput money to withdraw:"));
		if (Withdraw>balance) 
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (Withdraw>50000) 
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than 50000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (Withdraw%100!=0) 
		{
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw "+Withdraw%100+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, 
					"You withdraw "+Withdraw+" baht."+
					"\n1,000 ="+(Withdraw/1000)+
					"\n500 ="+((Withdraw%1000)/500)+
					"\n100 = "+((Withdraw%500)/100));
		}
	}

}
