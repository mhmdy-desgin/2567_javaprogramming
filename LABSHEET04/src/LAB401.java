import javax.swing.*;
public class LAB401 
{

	public static void main(String[] args) 
	{
		inputEmail();
		
	}
	public static void inputEmail() {
		String ans;
		String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input ur e-mail");
			if(varEmail !=null) {
				checkEmailError(varEmail);
			}
			else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
				
			}
			ans = JOptionPane.showInputDialog("Do you want to input email address [Y/y]");
		}while (ans != null && ans.equalsIgnoreCase("y"));
	}
		public static void checkEmailError(String email) 
		{
			while(email.startsWith("@")|| email.contains("")) {
				email = JOptionPane.showInputDialog("Invalid e-mail. INput your e-mail again:");
				
			}
			email = email.toLowerCase();
			JOptionPane.showMessageDialog(null,checkEmail(email));
		}
		public static boolean checkEmail(String email) {
			if (email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")) {
				return true;
			}
			else return false;
		}
	
}
