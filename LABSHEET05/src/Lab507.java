import javax.swing.*;

public class Lab507 {
	
	public static void showEven(int[] sums) {
		String sum = "";
		for(int sum_ : sums) {
			if (sum_ % 2 == 0) {
				sum += sum_ + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "Listt of even number : \n" + sum);
	}
	
	public static void showOdd(int[] sums) {
		String sum = "";
		for(int sum_ : sums) {
			if (sum_ % 2 != 0) {
				sum += sum_ + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "Listt of Odd number : \n" + sum);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i + 1) + " : "));
		}
		
		showEven(num);
		showOdd(num);

	}

}
