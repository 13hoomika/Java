public class HoneyRunner{
	public static void main(String details[]){
		Honey h = new Honey();
		h.setId(5432);
		h.setBrand("INDIGENOUS HONEY");
		h.setFlavour("Wild Honey");
		
		int id = h.getId();
		String brand = h.getBrand();
		String flavour = h.getFlavour();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("flavour: "+ flavour);
	}
}