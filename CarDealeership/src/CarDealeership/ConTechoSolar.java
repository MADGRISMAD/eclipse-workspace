package CarDealeership;

class ConTechoSolar extends ConAccesorioExtra{

	public ConTechoSolar(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getDescripcion() {
		return vehiculo.getDescripcion() + ", Techo Solar";
	}
	
	public double cost() {
		return vehiculo.cost() + 2000;
	}
	
	

}
