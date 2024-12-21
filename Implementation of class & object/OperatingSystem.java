class OperatingSystem
{
	String name;
	String version;
	
	OperatingSystem()
	{
		System.out.println("Operating System constructor invoked");
	}
	public void getDetails()
	{
		System.out.println("OperatingSystem Name: "+name);
		System.out.println("OperatingSystem Version: "+version);
		System.out.println("-------------------------------------------");
	}
}