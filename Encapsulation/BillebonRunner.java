public class BillebonRunner{
	public static void main(String details[]){
		Billebon b = new Billebon();
		b.setId(10551);
		b.setBrand("Billebon");
		b.setSpecialFeature("portable,portable,portable");
		b.setSize("Standard");
		
		
		int id = b.getId();
		String brand = b.getBrand();
		String specialFeature = b.getSpecialFeature();
		String size = b.getSize();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("Special Feature: "+ specialFeature);
		System.out.println("Size: "+ size);
	}
}