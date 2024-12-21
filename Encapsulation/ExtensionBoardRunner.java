public class ExtensionBoardRunner{
	public static void main(String details[]){
		ExtensionBoard e = new ExtensionBoard();
		e.setId(24205);
		e.setBrand("Portronics");
		e.setTotalPowerOutlets(4);
		e.setVoltage("5 Volts");
		
		
		int id = e.getId();
		String brand = e.getBrand();
		int totalPowerOutlets = e.getTotalPowerOutlets();
		String voltage = e.getVoltage();
		
		System.out.println("Id: "+ id);
		System.out.println("Brand: "+ brand);
		System.out.println("Total Power Outlets: "+ totalPowerOutlets);
		System.out.println("Voltage: "+ voltage);
	}
}