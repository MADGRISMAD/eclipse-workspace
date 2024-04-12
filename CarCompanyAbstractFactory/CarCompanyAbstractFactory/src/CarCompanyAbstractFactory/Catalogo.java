package CarCompanyAbstractFactory;

public class Catalogo {
	
	private FabricaVehiculo fabrica;
	
	public Catalogo(FabricaVehiculo fabrica) {
		this.fabrica = fabrica;
	}
	
	public void visualiza() {
		Automovil automovil = fabrica.creaAutomovil();
		Scooter scooter = fabrica.creaScooter();
		
		System.out.println("Catalogo de Automoviles y Scooters");
		System.out.println(automovil.getTipo());
		System.out.println(scooter.getTipo());
	}

}
