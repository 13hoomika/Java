public class ExtensionBoard{
	private int id;
	private String brand;
	private int totalPowerOutlets;
	private String voltage;
	
	public ExtensionBoard(){
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
	public void setTotalPowerOutlets(int totalPowerOutlets){
		this.totalPowerOutlets = totalPowerOutlets;
	}
	public int getTotalPowerOutlets(){
		return totalPowerOutlets;
	}
	public void setVoltage(String voltage){
		this.voltage = voltage;
	}
	public String getVoltage(){
		return voltage;
	}
}