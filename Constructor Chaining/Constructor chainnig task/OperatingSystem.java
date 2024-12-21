class OperatingSystem
{
	String name;
	String version;
	
	public OperatingSystem()
	{
		this("Android","android-14");
		System.out.println("Operating System default constructor invoked");
	}
	OperatingSystem(String name,String version)
	{
		this.name = name;
		this.version = version;
		System.out.println("Operating System parameterized constructor invoked");
	}
	public void getDetails()
	{
		System.out.println("OperatingSystem Name: "+name);
		System.out.println("OperatingSystem Version: "+version);
		System.out.println("-------------------------------------------");
	}
}