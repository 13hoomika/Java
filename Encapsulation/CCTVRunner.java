public class CCTVRunner{
	public static void main(String details[]){
		CCTV c = new CCTV();
		c.setId(24205);
		c.setBrand("CP PLUS");
		c.setModelName("CP");
		c.setConnectivityTechnology("Wireless");
		
		
		int id = c.getId();
		String brand = c.getBrand();
		String modelName = c.getModelName();
		String connectivityTechnology = c.getConnectivityTechnology();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("Model Name: "+ modelName);
		System.out.println("Connectivity Technology: "+ connectivityTechnology);
	}
}