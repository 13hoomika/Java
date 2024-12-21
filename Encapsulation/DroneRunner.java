public class DroneRunner{
	public static void main(String details[]){
		Drone d = new Drone();
		d.setId(5678);
		d.setBrand("Pluto");
		d.setAgeRange("Adult");
		
		int id = d.getId();
		String brand = d.getBrand();
		String ageRange = d.getAgeRange();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("ageRange: "+ ageRange);
	}
}