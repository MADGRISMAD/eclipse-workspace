package CarCompanyAbstractFactory;

public class FabricaVehiculoElectricidad implements FabricaVehiculo{

	@Override
	public Automovil creaAutomovil() {
		return new AutomovilElectricidad();
	}

	@Override
	public Scooter creaScooter() {
		return new ScooterElectricidad();
	}

}
