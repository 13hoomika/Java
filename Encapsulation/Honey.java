public class Honey{
	private int id;
	private String brand;
	private String flavour;
	
	public Honey(){
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
	public void setFlavour(String flavour){
		this.flavour = flavour;
	}
	public String getFlavour(){
		return flavour;
	}
	
}