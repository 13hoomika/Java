class OperatingSystemTester
{
	public static void main(String val[])
	{
		OperatingSystem os1 = new OperatingSystem();
		os1.name = "Android";
		os1.version = "android-12";
		os1.getDetails();
		
		OperatingSystem os2 = new OperatingSystem();
		os2.name = "Android";
		os2.version = "android-14";
		os2.getDetails();
		
		OperatingSystem os3 = new OperatingSystem();
		os3.name = "Android";
		os3.version = "android-10";
		os2.getDetails();
		
		OperatingSystem os4 = new OperatingSystem();
		os4.name = "Android";
		os4.version = "android-8";
		os4.getDetails();
		
		OperatingSystem os5 = new OperatingSystem();
		os5.name = "MacOS";
		os5.version = "MacOS-12";
		os5.getDetails();
		
		OperatingSystem os6 = new OperatingSystem();
		os6.name = "MacOS";
		os6.version = "MacOS-9";
		os6.getDetails();
		
		OperatingSystem os7 = new OperatingSystem();
		os7.name = "Linux";
		os7.version = "Linux-06";
		os7.getDetails();
		
		OperatingSystem os8 = new OperatingSystem();
		os8.name = "Linux";
		os8.version = "Linux-04";
		os8.getDetails();
		
		OperatingSystem os9 = new OperatingSystem();
		os9.name = "MacOS";
		os9.version = "MacOS-06";
		os9.getDetails();
	}
}