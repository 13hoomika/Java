public class EyelinerRunner{
	public static void main(String details[]){
		Eyeliner e = new Eyeliner();
		e.setId(54121312);
		e.setBrand("Elitty");
		e.setFinishType("Matte");
		
		int id = e.getId();
		String brand = e.getBrand();
		String finiseType = e.getFinishType();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("finiseType: "+ finiseType);
	}
}