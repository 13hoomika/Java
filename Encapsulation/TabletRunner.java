class TabletRunner{
	public static void main(String val[]){
		Tablet t = new Tablet();
		t.setBrand("Samsung");
		t.setModelName("Galaxy Tab A9+");
		t.setMemory("128 GB");
		String brand = t.getBrand();
		String modelName = t.getModelName();
		String memory = t.getMemory();
		
		System.out.println("Brand: "+ brand);
		System.out.println("Model name: "+ modelName);
		System.out.println("Memory: "+ memory);
	}
}