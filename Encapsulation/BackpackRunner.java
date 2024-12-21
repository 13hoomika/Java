public class BackpackRunner{
	public static void main(String details[]){
		Backpack b = new Backpack();
		b.setId(1315);
		b.setBrand("FUR JADEN");
		b.setCareInstructions("Hand Wash Only");
		b.setCountryofOrigin("India");
		
		
		int id = b.getId();
		String brand = b.getBrand();
		String careInstructions = b.getCareInstructions();
		String countryofOrigin = b.getCountryofOrigin();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("CareInstructions: "+ careInstructions);
		System.out.println("CountryofOrigin: "+ countryofOrigin);
	}
}