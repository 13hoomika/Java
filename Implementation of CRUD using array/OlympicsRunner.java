class OlympicsRunner{
	public static void main(String OlympicsSports[]){
		boolean isListCreated = Olympics.setSports("Judo");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Weightlifting");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Volleyball");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Handball");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Badminton");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Swimming");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Archery");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Modren Pentathlon");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Taekwondo");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("wrestling");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Fencing");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Equestrian");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Boxing");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Sailing");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		isListCreated = Olympics.setSports("Alpine Skiing");
		System.out.println("Sport name added to list - "+ isListCreated);
		
		Olympics.getSports();
		
		boolean update = Olympics.updatesportsList("Sailing","Shooting");
		System.out.println("Updated planet name "+ update);
		
		Olympics.getSports();
		
		boolean delete = Olympics.deleteByName("Alpine Skiing");
		System.out.println("Deleted "+ delete);
		
		Olympics.getNewArr();
		
	}
}