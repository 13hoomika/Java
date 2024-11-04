class TabletRunner{
	public static void main(String val[]){
		Tablet t = new Tablet();
		t.setBrand("Samsung");
		t.setModelName("Galaxy S24");
		t.setMemory("128 GB");
		String brand = t.getBrand();
		String modelName = t.getModelName();
		String memory = t.getMemory();
		System.out.println("Brand: "+ brand);
		System.out.println("Color: "+ modelName);
		System.out.println("Ear Placement: "+ memory);
	}
}