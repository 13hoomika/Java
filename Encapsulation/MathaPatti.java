public class MathaPatti{
	private int id;
	private String metaltype;
	
	public MathaPatti(){
		System.out.println("Default constructor is invoked!!");
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void setMetaltype(String metaltype){
		this.metaltype = metaltype;
	}
	public String getMetaltype(){
		return metaltype;
	}
}