
import javax.swing.*;

public class Lab508_1 {

    public static boolean checkIndex(int[] nums, int index) {
        // ใช้ Conditional Operator เพื่อคืนค่า true หรือ false
        return (index >= 0 && index < nums.length) ? true : false;
    }

    public static int currentData(int[] nums, int index) {
        // คืนค่าตำแหน่งปัจจุบัน
        return nums[index];
    }

    public static int prevData(int[] nums, int index) {
        // ใช้ Conditional Operator เพื่อคืนค่าก่อนหน้าหรือ 0 หากไม่มีค่าก่อนหน้า
        return (index > 0) ? nums[index - 1] : -1;
    }

    public static int nextData(int[] nums, int index) {
        // ใช้ Conditional Operator เพื่อคืนค่าถัดไปหรือ 0 หากไม่มีค่าถัดไป
        return (index < nums.length - 1) ? nums[index + 1] : -1;
    }

    public static void main(String[] args) {
        int[] nums = {25, 78, 41, 22, 36, 85, 37};

        // รับค่า index จากผู้ใช้
        int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
        
        // ใช้ Conditional Operator เพื่อควบคุมลูป
        while (!checkIndex(nums, index)) {
            index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
        }

        // ดึงค่าปัจจุบัน, ก่อนหน้า, และถัดไป
        int current = currentData(nums, index);
        int prev = prevData(nums, index);
        int next = nextData(nums, index);

        // ใช้ Conditional Operator ในการสร้างข้อความ
        String message = "Current data at index [" + index + "] is " + current + "\n"
                + ((prev != -1) ? "Previous data, nums [" + (index - 1) + "] is " + prev + "\n"
                                : "No previous data\n")
                + ((next != -1) ? "Next data, nums [" + (index + 1) + "] is " + next + "\n"
                                : "No next data");

        // แสดงข้อความ
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
