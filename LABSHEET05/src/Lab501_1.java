import javax.swing.*;

public class Lab501_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		boolean nameChaeck = false;
		
		String dep = JOptionPane.showInputDialog("Enter a departnert name");
		
		for (int i = 1; i < deptName.length; i++) {
			//ใช้เมธอด equalsIgnoreCase เพื่อเปรียบเทียบข้อความ โดยไม่สนใจตัวพิมพ์เล็ก-ใหญ่
			if ( dep.equalsIgnoreCase(deptName[i]) ) {
				nameChaeck = true;
			}
			
		}
		
		if ( nameChaeck ) {
			JOptionPane.showMessageDialog(null, dep
					+ " was fount in the list.");
		} else {
			JOptionPane.showMessageDialog(null, dep
					+ " was not fount in the list." );
		}
		
		
		
		

	}

}
