
public class Democar {

	public static void main(String[] args) {
		// สร้างออบเจ็กต์ Car โดยใช้ Constructor แบบกา หนดค่าพารามิเตอร
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		//แสดงข้อมูลเริ่มตน
		System.out.println(car);
		//อัปเดตข้อมูลใหม่ที่ถูกต้อง
		car.setCompanyName("Toyota");
		car.setmodelName("Corolla");
		car.setYear(2015);
		System.out.println("");
		System.out.println("Updated Car Details:");
		System.out.println("Company Name:"+car.getCompanyName());
		System.out.println("Model Name:"+car.getmodelName());
		System.out.println("Year:"+car.getyear());
		//ทดสอบการต้้งค่าที่ไม่ถูกต้อง
		car.setYear(1000);
		car.setCompanyName(" ");
	}
}
