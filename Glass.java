class Glass{
	int glassId;
	String type;
	
	public Glass()
	{
		System.out.println("Glass constructor invoked here!!");
	}
	public Glass(int id,String t)
	{
		glassId = id;
		type = t;
	}
	
	public void getGlassInfo(){
		System.out.println("Glass ID: "+glassId);
		System.out.println("Glass type: "+type);
		System.out.println("----------------------------------------------------------------");
	}
}