
public class Car {
	private String companyName;
	private String modelName;
	private double mileage;
	private int year;
	Car(){
		companyName="Unknown";
		modelName="Unknown";
		year=2000;
		mileage=0.0;
		//this("Unknown","Unknown",2000,0.0);
	}
	//Parameterize Constructor
	Car(String companyName,String modelName, int year , double mileage){
		this.companyName = companyName;
		this.modelName = modelName;
		//Default of road is 2000 if the year is less than 1886 or the year is invalid
		this.year = year>=1886? year:2000;
	}
	//getters and setters method()
	public void setCompanyName(String companyName) {
		if (companyName != null && !companyName.trim().isEmpty()) {
			this.companyName=companyName;
		}else {
			System.out.println("Error: Invalid company name!");
		}
	}
	public void setmodelName(String modelName) {
		if (modelName != null && !modelName.trim().isEmpty()) {
			this.modelName=modelName;
		}else {
			System.out.println("Error: Invalid model name!");
		}
	}
	public void setYear(int year) {
		if (year >=1886) {
			this.year = year;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	public double getmileage() {
		return this.mileage = mileage;
	}
	public int getyear() {
		return this.year = year;
	}
	public String getmodelName() {
		return this.modelName=modelName;
	}
	public String getCompanyName() {
		return this.companyName=companyName;
	}
	public String toString() {
		return "Company Name: "+companyName+"\nModel Name: "
	+modelName+"\nYear : "+year+"\nMileage: "+mileage;
	}
	
}
