package CarCompanyAbstractFactory;

public class testDriveFabrica {
	
	public static void main(String[] args) {
		FabricaVehiculo fabrica = new FabricaVehiculoElectricidad();
		Automovil auto = fabrica.creaAutomovil();
		Scooter scooter = fabrica.creaScooter();
		System.out.println(auto.getTipo());
		System.out.println(scooter.getTipo());

		fabrica = new FabricaVehiculoGasolina();
		auto = fabrica.creaAutomovil();
		scooter = fabrica.creaScooter();
		System.out.println(auto.getTipo());
		System.out.println(scooter.getTipo());
	}

}
