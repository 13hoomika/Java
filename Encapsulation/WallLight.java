public class WallLight{
	private int id;
	private String brand;
	private String style;
	
	public WallLight(){
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
	public void setStyle(String style){
		this.style = style;
	}
	public String getStyle(){
		return style;
	}
	
}