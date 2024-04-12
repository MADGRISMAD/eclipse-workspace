package CarCompanyAbstractFactory;

public class FabricaVehiculoGasolina implements FabricaVehiculo{
		
	@Override
	public Automovil creaAutomovil() {
		return new AutomovilGasolina();
	}

	@Override
	public Scooter creaScooter() {
		return new ScooterGasolina();
	}

}
