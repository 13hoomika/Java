public class MathaPattiRunner{
	public static void main(String details[]){
		MathaPatti m = new MathaPatti();
		m.setId(69);
		m.setMetaltype("Brass Plated Gold");
				
		int id = m.getId();
		String metaltype = m.getMetaltype();
		
		System.out.println("Id: "+ id);
		System.out.println("Metal type: "+ metaltype);
	}
}