public class Tablet{
	private String brand;
	private String modelName;
	private String memory;
	
	public Tablet()
	{
		System.out.println("Default constructor is invoked!!..");
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}
	public String getModelName()
	{
		return modelName;
	}
	public void setMemory(String memory)
	{
		this.memory = memory;
	}
	public String getMemory()
	{
		return memory;
	}
}