
public class TestSmartPhone {
	public static void main(String[] args) {

		Smartphone phone = new Smartphone();

		System.out.println("กำลังต้้งค่าข้อมูลสมาร์ทโฟนเริ่มต้น ...");
		phone.setBrand("SmartMobile"); 
		phone.setModel("W1000"); 
		phone.setStorageCapacity(256); 

		System.out.println("\nข้อมูลสมาร์ทโฟนเบื้องต้น :");
		phone.printDetails();

		System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
		phone.increaseStorage(100);
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
		phone.increaseStorage(200);
		System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
		phone.increaseStorage(-50); // ไม่สา เร็จ:ค่าติดลบ
// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(valid used storage)
		System.out.println("\nคำนวณพื้นที่หน่วยความจำ ที่เหลือโดยใช้ไปแล้ว 120 GB...");
		int remainingStorage = phone.getRemainingStorage(120);
		if (remainingStorage != -1) {
			System.out.println("พื้นที่ที่เหลือ: " + remainingStorage + " GB");
		}
// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(invalid used storage)
		System.out.println("\nคำนวณพื้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 500 GB...");
		phone.getRemainingStorage(500); // ไม่สา เร็จ: เกินความจุ
// ทดสอบการต้งัค่าที่ไม่ถูกตอ้ง (brand และ model)
		System.out.println("\nต้้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง...");
		phone.setBrand(""); // ไม่สา เร็จ:แบรนดส์ ้ันเกินไป
		phone.setModel("A"); // ไม่สา เร็จ:รุ่นส้ันเกินไป
// ทดสอบการต้งัค่าความจุที่ไม่ถูกตอ้ง
		System.out.println("\nต้้งค่าความจุหน่วยความจำ ที่ไม่ถูกต้อง...");
		phone.setStorageCapacity(600); // ไม่สา เร็จ: เกินขีดจา กดั
// แสดงรายละเอียดสมาร์ทโฟนหลงัการต้งัค่าต่างๆ
		System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
		phone.printDetails();
	}
}
