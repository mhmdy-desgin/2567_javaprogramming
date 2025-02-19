
import javax.swing.JOptionPane;

public class Shop100Baht {
    public static void main(String[] args) {
        Product sold = new Product();

        

        int response = JOptionPane.showConfirmDialog(null, "Is this program run on Pattanakarn Branch?", "Branch Selection", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            sold = new PattanakarnBranch(); 
        } else {
            sold = new Product(); 
        }

        int number = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: "));
        sold.setUnit(number);

        
        JOptionPane.showMessageDialog(null, sold);

    }
}