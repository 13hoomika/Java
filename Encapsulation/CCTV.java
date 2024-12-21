public class CCTV{
	private int id;
	private String brand;
	private String modelName;
	private String connectivityTechnology;
	
	public CCTV(){
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
	public void setModelName(String modelName){
		this.modelName = modelName;
	}
	public String getModelName(){
		return modelName;
	}
	public void setConnectivityTechnology(String connectivityTechnology){
		this.connectivityTechnology = connectivityTechnology;
	}
	public String getConnectivityTechnology(){
		return connectivityTechnology;
	}
}