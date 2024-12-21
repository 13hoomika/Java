public class Drone{
	private int id;
	private String brand;
	private String ageRange;
	
	public Drone(){
		System.out.println("Default constructor is invoked!!");
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setAgeRange(String ageRange){
		this.ageRange = ageRange;
	}
	public String getAgeRange(){
		return ageRange;
	}
	
}