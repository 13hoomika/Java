public class Eyeliner{
	private int id;
	private String brand;
	private String finishType;
	
	public Eyeliner(){
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
	public void setFinishType(String finishType){
		this.finishType = finishType;
	}
	public String getFinishType(){
		return finishType;
	}
	
}