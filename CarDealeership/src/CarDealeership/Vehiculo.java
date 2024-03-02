package CarDealeership;


public abstract class Vehiculo {
	String descripcion = "Vehiculo generico";
	
	public String getDescripcion() {
		return descripcion;
	}
	
	
	
	public abstract double cost();
	

}
