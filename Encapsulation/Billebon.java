public class Billebon{
	private int id;
	private String brand;
	private String specialFeature;
	private String size;
	
	public Billebon(){
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
	public void setSpecialFeature(String specialFeature){
		this.specialFeature = specialFeature;
	}
	public String getSpecialFeature(){
		return size;
	}
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){
		return size;
	}
}