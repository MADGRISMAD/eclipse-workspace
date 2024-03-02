package CarDealeership;

import java.util.Scanner;

public class DealeershipTest {
    
    public static void main(String[] args) {
        
    	Vehiculo vehiculo = new Familiar();
    	System.out.println(vehiculo.getDescripcion()
    	+ " $" + vehiculo.cost());
    	
    	vehiculo = new Familiar();
    	vehiculo = new ConAireAcondicionado(vehiculo);
    	vehiculo = new ConPinturaMetalizada(vehiculo);
    	vehiculo = new ConTechoSolar(vehiculo);
    	vehiculo = new ConTechoSolar(vehiculo);
    	vehiculo = new ConTechoSolar(vehiculo);
    	
    	System.out.println(vehiculo.getDescripcion()
    			+ " $" + vehiculo.cost());
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
