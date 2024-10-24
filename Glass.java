class Glass{
	int glassId;
	String type;
	
	public Glass()
	{
		System.out.println("Glass constructor invoked here!!");
	}
	
	public void getGlassInfo(){
		System.out.println("Glass ID: "+glassId);
		System.out.println("Glass type: "+type);
		System.out.println("--------------------------");
	}
}