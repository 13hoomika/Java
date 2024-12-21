public class Backpack{
	private int id;
	private String brand;
	private String careInstructions;
	private String countryofOrigin;
	
	public Backpack(){
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
	public void setCareInstructions(String careInstructions){
		this.careInstructions = careInstructions;
	}
	public String getCareInstructions(){
		return careInstructions;
	}
	public void setCountryofOrigin(String countryofOrigin){
		this.countryofOrigin = countryofOrigin;
	}
	public String getCountryofOrigin(){
		return countryofOrigin;
	}
}