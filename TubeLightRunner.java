class TubeLightRunner{
	public static void main(String led[]){
		TubeLight LaserRay= new TubeLight(10840,"Crompton","139 rs","20W");
		LaserRay.TubeLightDetails();
		
		TubeLight bajaj= new TubeLight(20763,"Bajaj","279 rs","20W");
		bajaj.TubeLightDetails();
		
		TubeLight halonix= new TubeLight(30644,"Halonix","598 rs","20W");
		halonix.TubeLightDetails();
		
		TubeLight wiproGarnet= new TubeLight(30789,"Wipro Garnet","159 rs","20W");
		wiproGarnet.TubeLightDetails();
		
		TubeLight bluex= new TubeLight(50678,"Bluex Bulbs","338 rs","20W");
		bluex.TubeLightDetails();
		
		TubeLight philips = new TubeLight(60894,"PHILIPS","172 rs","5W");
		philips.TubeLightDetails();
		
		TubeLight eveready = new TubeLight(70644,"Eveready","309 rs","5W");
		eveready.TubeLightDetails();
		
		TubeLight hoteon= new TubeLight(8895,"Hoteon","839 rs","8W");
		hoteon.TubeLightDetails();
		
		TubeLight philipsLED= new TubeLight(90644,"Philips LED","213 rs","6W");
		philipsLED.TubeLightDetails();
		
		
	}
}