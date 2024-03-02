package CarDealeership;

public class ConPinturaMetalizada extends ConAccesorioExtra{

	public ConPinturaMetalizada(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getDescripcion() {
		return vehiculo.getDescripcion() + ", Pintura Metalizada";
	}
	
	public double cost() {
		return vehiculo.cost() + 500;
	}

}
