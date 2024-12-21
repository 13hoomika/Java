class WallLightRunner{
	public static void main(String lights[]){
		WallLight w = new WallLight();
		w.setId(1345);
		w.setBrand("Homesake");
		w.setStyle("Lantern");
		int id = w.getId();
		String brand = w.getBrand();
		String style = w.getStyle();
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("Style: "+ style);
	}
}