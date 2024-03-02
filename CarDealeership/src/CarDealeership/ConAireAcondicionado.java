package CarDealeership;

public class ConAireAcondicionado extends ConAccesorioExtra  {

	public ConAireAcondicionado(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getDescripcion() {
		return vehiculo.getDescripcion() + ", Aire Acondicionado";
	}
	
	public double cost() {
		return vehiculo.cost() + 2000;
	}

}
