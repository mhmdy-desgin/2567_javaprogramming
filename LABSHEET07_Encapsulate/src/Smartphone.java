
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private int MAX_STORAGE_CAPACITY;
	Smartphone(){
		MAX_STORAGE_CAPACITY = 521;
	}
	public void setBrand(String brand) {
		if(brand.length()>2) {
			this.brand=brand;
		}else {
			System.out.println("Error: Brand must have at least 2 characters!");
		}
	}
	public void setModel(String model) {
		if(model.length()>2) {
			this.model=model;
		}else {
			System.out.println("Error: Model must have at least 2 characters!");
		}
	}
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity>1&&storageCapacity<512) {
			this.storageCapacity=storageCapacity;
		}else {
			System.out.println("Error: Storage capacity must be between1 and 512 GB!");
		}
	}
	public String getBrand() {
		return this.brand=brand;
	}
	public String getModel() {
		return this.model=model;
	}
	public int getStorageCapacity() {
		return this.storageCapacity=storageCapacity;
	}
	public void increaseStorage(int additionalStorage) {
		if (additionalStorage >0 &&additionalStorage+storageCapacity<MAX_STORAGE_CAPACITY) {
			this.storageCapacity = storageCapacity+additionalStorage;
			
		}else  {
			System.out.println("Error: Storage capacity cannot exceed"+MAX_STORAGE_CAPACITY+"GB!");
					
		}
		if (additionalStorage <=0) {
			System.out.println("Error: Additional storage must be positive!");
		}
		
	}
	public int getRemainingStorage(int usedStorage) {
		if (usedStorage>0&&usedStorage<storageCapacity) {
			int storageleft = storageCapacity-usedStorage;
			
			System.out.print("พื้นที่ที่เหลือ :"+ storageleft +" GB");
		}else {
			System.out.println("\"Error: Used storage must be between 0 and "+storageCapacity+"GB!");					
		}
		return -1;
	}
	public void printDetails() {
		System.out.print("Smartphone Details: \nBrand: "+brand+"\nModel: "
	+model+"\nStorage Capacity: "+storageCapacity+" GB\n");
	}
	
}
