class GalaxyRunner{
	public static void main(String MilkyWay[]){
		boolean isListCreated = Galaxy.savePlanets("Mercury");
		System.out.println("Planets  name added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Venus");
		System.out.println("Planets  added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Earth");
		System.out.println("Planets  added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Mars");
		System.out.println("Planets  added to list - "+ isListCreated);
			
		isListCreated = Galaxy.savePlanets("Jupiter");
		System.out.println("Planets  added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Saturn");
		System.out.println("Planets  added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Uranus");
		System.out.println("Planets added to list - "+ isListCreated);
		
		isListCreated = Galaxy.savePlanets("Neptune");
		System.out.println("Planets added to list - "+ isListCreated);
				
		Galaxy.fetchPlanets();
		
		boolean update = Galaxy.updatePlanetName("Earth","Mother Earth");
		System.out.println("Updated planet name "+ update);
		
		Galaxy.fetchPlanets();
		
		boolean del = Galaxy.delPlanets("Neptune");
		System.out.println("Deleted planet name "+ del);
		
		Galaxy.getNewPlanets();
	}
}