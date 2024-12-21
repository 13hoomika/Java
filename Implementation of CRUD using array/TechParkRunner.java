class TechParkRunner{
	public static void main(String company[]){
		boolean List = TechPark.createCom("Infosys");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("TCS");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("BHEL");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Wipro");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Tech Mahindra");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Hewlett-Packard");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("C-Dot");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("HCL");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Siemens");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Happiest Minds");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("General Electric");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Deutsche Bank");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("3M");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Robert Bosch Engineering Private Limited");
		System.out.println("Name of Company name added to list - "+ List);
		
		List = TechPark.createCom("Think soft Global");
		System.out.println("Name of Company name added to list - "+ List);
		
		TechPark.fetchComp();
		
		boolean update = TechPark.updateCompName("3M","IBM");
		System.out.println("Updated Company name " + update);
		
		TechPark.fetchComp();
		
		boolean delete = TechPark.deleteByName("IBM");
		System.out.println("Deleted "+ delete);
		
		TechPark.getNewArr();
	}
}