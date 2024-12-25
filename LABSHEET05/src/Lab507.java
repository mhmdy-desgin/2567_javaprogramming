import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i=0; i<nums.length;i++) {
			String input = JOptionPane.showInputDialog("Input Number"+(i+1)+" :");
			nums[i]=Integer.parseInt(input);
		}
		showEven(nums);
		showOdd(nums);

	}
	public static void showEven (int[] nums){
		String Evennum = "List of even numbers : \n";
		for (int num:nums ) {
			if (num%2==0) {
				Evennum += num + " ";
			}
		}
		JOptionPane.showMessageDialog(null, Evennum);
	}
	public static void showOdd (int[] nums) {
		String Oddnum = "List of odd numbers : \n";
		for (int num:nums) {
			if (num%2!=0) {
				Oddnum += num + " ";
			}
		}
		JOptionPane.showMessageDialog(null,Oddnum);
		
	}

}
