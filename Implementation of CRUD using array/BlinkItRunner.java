class BlinkItRunner{
	public static void main(String Categories[]){
		// boolean isListCreated = BlinkIt.createCat("Chicken, Meat & Fish");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Pet Care");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Fruits & Veggies in Mins");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Bakery & Biscuits");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Instant And Frozen Food");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Baby Care");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Magazines");
		// System.out.println("Categories added to list - "+ isListCreated);
		
		// isListCreated = BlinkIt.createCat("Atta, Rice & Dal");
		// System.out.println("Categories added to list - "+ isListCreated);

		BlinkIt.createCat("Chicken, Meat & Fish");
		BlinkIt.createCat("Pet Care");
		BlinkIt.createCat("Fruits & Veggies in Mins");
		BlinkIt.createCat("Bakery & Biscuits");
		BlinkIt.createCat("Instant And Frozen Food");
		BlinkIt.createCat("Baby Care");
		BlinkIt.createCat("Magazines");
		BlinkIt.createCat("Atta, Rice & Dal");
		
		System.out.println("-----------------------------------------------");
		BlinkIt.fetchCat();
		
		System.out.println("-----------------------------------------------");
		boolean updated = BlinkIt.updateCat("Magazines","Books & Stationary");
		System.out.println("Category Updated " + updated);
		
		System.out.println("-----------------------------------------------");		
		BlinkIt.fetchCat();
		
		boolean delCat = BlinkIt.deleteCat("Atta, Rice & Dal");
		System.out.println(delCat);
		
		BlinkIt.getNewCat();
	}
}