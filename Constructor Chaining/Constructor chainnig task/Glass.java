class Glass{
	int glassId;
	String type;
	
	public Glass()
	{
		this(101,"Computer Bluelight Blocking Glasses");
		System.out.println("Glass default constructor invoked here!!");
	}
	public Glass(int glassId,String type)
	{
		this.glassId = glassId;
		this.type = type;
		System.out.println("parameterized constructor with int type invoked here!!");
	}
	
	public void getGlassInfo(){
		System.out.println("Glass ID: "+ glassId);
		System.out.println("Glass type: "+ type);
		System.out.println("-----------------------------------------------");
	}
}